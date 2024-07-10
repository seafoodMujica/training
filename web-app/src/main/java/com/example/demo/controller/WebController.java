package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ホームページに関するコントローラークラスです。
 */
@Controller
public class WebController {

	/**
	 * index画面を表示する。
	 *
	 * @param model ビューに渡すモデルオブジェクト
	 * @return index画面
	 */
	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("message", "ようこそ");
		model.addAttribute("datetime", LocalDateTime.now());
		return "index";
	}

	/**
	 * NullPointerExceptionを発生させる。
	 *
	 * @return 無し
	 */
	@GetMapping("/ex1")
	public String errorEx1() {

		String ex1 = null;

		System.out.print(ex1.isEmpty());

		return "";
	}

	/**
	 * NumberFormatExceptionを発生させる。
	 *
	 * @return 無し
	 */
	@GetMapping("/ex2")
	public String errorEx2() {

		String ex2String = "hoge";
		int ex2Int = Integer.parseInt(ex2String);

		System.out.print(ex2Int);
		return "";

	}

	/**
	 * IndexOutOfBoundsExceptionを発生させる。
	 *
	 * @return 無し
	 */
	@GetMapping("/ex3")
	public String errorEx3() {

		List<String> ex3 = new ArrayList<String>();

		ex3.get(55);

		return "";
	}

}
