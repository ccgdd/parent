package com.resthome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.EasyUITreeNode;
import com.resthome.service.ContentCategoryService;
import com.resthome.utils.RestHomeResult;

@Controller
public class ContentCategoryController {
		
		@Autowired
		private ContentCategoryService contentCategoryService;
		
		
		/**
		 * 楼层管理的子节点查询
		 * @param parentId
		 * @return
		 */
		@RequestMapping("/content/category/list")
		@ResponseBody
		public List<EasyUITreeNode> getContentCatList(
				@RequestParam(name="id", defaultValue="0") Long parentId) {
			
			List<EasyUITreeNode> list = contentCategoryService.getContentCategoryList(parentId);
			return list;
		}
		
		/**
		 * 楼层管理的新增子节点
		 */
		@RequestMapping("/content/category/create")
		@ResponseBody
		public RestHomeResult createCategory(Long parentId, String name) {
			RestHomeResult result = contentCategoryService.addContentCategory(parentId, name);
			
			return result;
		}
		
		/**
		 * 重命名节点
		 */
		@RequestMapping("/content/category/update")
		@ResponseBody
		public RestHomeResult updateCategoryName(Long id , String name){
			
			contentCategoryService.updateCategoryName(id, name);
			
			return RestHomeResult.ok();
		}
		
		/**
		 * 删除节点
		 */
		@RequestMapping("/content/category/delete/")
		@ResponseBody
		public RestHomeResult deleteCategoryNode(long id){
			
			RestHomeResult RestHomeResult = contentCategoryService.deleteNode(null, id);
			
			return RestHomeResult;
		}
		
		
		/**
		 * 商品分类
		 */
		/*@RequestMapping("/content/query/list")
		@ResponseBody
		public EasyUIDataGridRestful getContentCetList(Long categoryId ,int page, int rows){
			
			EasyUIDataGridRestful contentCetList = service.getContentCetList(categoryId,page, rows);
			
			return contentCetList;
			
			
		}*/
}

