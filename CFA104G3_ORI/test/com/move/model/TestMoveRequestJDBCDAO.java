package com.move.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 測試完畢後請還原資料庫
 * 
 * @author Elviz
 */
// 一個方法對應一個test
public class TestMoveRequestJDBCDAO {
	private MoveRequestJDBCDAO dao;
	
	// 建立物件
	@BeforeEach
	public void before() {
		dao = new MoveRequestJDBCDAO();
	}

	// 清除
	@After
	public void after() {
		dao = null;
	}
	
	// 注意命名方式大小寫
	@Test
	public void testInsert() {
		MoveRequestVO vo = new MoveRequestVO();
		
		// TODO 填入資料, 注意FK資料是否存在
		vo.setMemberId(2);
		vo.setFromAddress("日本東京都");
		vo.setToAddress("美國洛杉磯");
		vo.setEvauateDate(Timestamp.valueOf("2022-10-10 15:00:06"));
		vo.setEvaluateType(0);
		vo.setItem("罐頭");
		vo.setEvauatePrice(100);
		vo.setMoveDate(Timestamp.valueOf("2022-10-12 15:00:06"));
		vo.setStatus("申請審核中");
		vo.setRequestDate(Timestamp.valueOf("2022-10-05 15:00:06"));
		vo.setHandled(false);
		
		int row = dao.insert(vo);
		assertNotEquals(row, 0);
	}
	
	@Test
	public void testDeleteById() {
		// TODO 刪除後別忘記還原
		int row = dao.deleteById(1);
		assertNotEquals(row, 0);
	}
	
	@Test
	public void testUpdate() {
		// TODO 請記得填入vo資料
		MoveRequestVO vo = new MoveRequestVO();
		
		// TODO 填入資料, 注意PK、FK資料是否存在
		vo.setId(1);
		vo.setMemberId(1);
		vo.setFromAddress("日本東京都");
		vo.setToAddress("美國洛杉磯");
		vo.setEvauateDate(Timestamp.valueOf("2022-05-16"));
		vo.setEvaluateType(0);
		vo.setItem("罐頭(鮪魚)");
		vo.setEvauatePrice(100);
		vo.setMoveDate(Timestamp.valueOf("2022-10-12"));
		vo.setStatus("申請審核中");
		vo.setHandled(false);
		vo.setRequestDate(Timestamp.valueOf("2022-10-05 15:00:06"));
		
		int row = dao.update(vo);
		assertNotEquals(row, 0);
	}
	
	@Test
	public void testSelectById() {
		MoveRequestVO vo = dao.selectById(1);
		assertNotNull(vo);
	}
	
	@Test
	public void testSelectAll() {
		List<MoveRequestVO> vos = dao.selectAll();
		assertTrue(vos.size() > 0);
	}
}
