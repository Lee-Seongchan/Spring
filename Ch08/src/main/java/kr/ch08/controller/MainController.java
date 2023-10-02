package kr.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.ch08.entity.User1Entity;
import kr.ch08.repository.User1Repository;

@Controller
public class MainController {

		@Autowired
		private User1Repository repo;
	
		@GetMapping(value = {"/", "/index"})
		public String index() {
			return "/index";
		}
		
		
		@GetMapping("/query1")
		public String query1() {
			//id = A102인 것을 출력
			User1Entity entity = repo.findUser1EntityByUid("A102");
			System.out.println(entity);
			
			return "redirect:/";
		}
		
		@GetMapping("/query2")
		public String query2() {
			//이름이 이순신인 것을 출력
			List<User1Entity> list = repo.findUser1EntityByName("이순신");
			System.out.println(list);
			
			return "redirect:/";
		}
		
		@GetMapping("/query3")
		public String query3() {
			//이름이 이순신이 아닌것 출력
			List<User1Entity> list = repo.findUser1EntityByNameNot("이순신");
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query4")
		public String query4() {
			User1Entity list = repo.findUser1EntityByUidAndName("a103", "이순신");
			System.out.println(list);
			
			return "redirect:/";
		}
		
		@GetMapping("/query5")
		public String query5() {
			List<User1Entity> list = repo.findUser1EntityByAgeGreaterThan(10);
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query6")
		public String query6() {
			List<User1Entity> list = repo.findUser1EntityByAgeGreaterThanEqual(10);
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query7")
		public String query7() {
			List<User1Entity> list = repo.findUser1EntityByAgeLessThan(10);
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query8")
		public String query8() {
			List<User1Entity> list = repo.findUser1EntityByAgeLessThanEqual(10);
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query9")
		public String query9() {
			List<User1Entity> list = repo.findUser1EntityByAgeBetween(5, 15);
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query10")
		public String query10() {
			//이름이 이순신인 목록을 출력
			List<User1Entity> list = repo.findUser1EntityByNameLike("이순신");
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query11")
		public String query11() {
			//이름에 '이'가 포함된 것을 출력
			List<User1Entity> list = repo.findUser1EntityByNameContains("이");
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query12")
		public String query12() {
			// 이름이 김으로 시작되는 목록 출력
			List<User1Entity> list = repo.findUser1EntityByNameStartsWith("김");
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query13")
		public String query13() {
			// 이름의 끝이 신으로 끝나는 목록 출력
			List<User1Entity> list = repo.findUser1EntityByNameEndsWith("신");
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query14")
		public String query14() {
			//이름 순서대로 출력
			List<User1Entity> list = repo.findUser1EntityByOrderByName();
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query15")
		public String query15() {
			//나이기준 오름차순 
			List<User1Entity> list = repo.findUser1EntityByOrderByAgeAsc();
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query16")
		public String query16() {
			//나이기준 내림차순
			List<User1Entity> list = repo.findUser1EntityByOrderByAgeDesc();
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query17")
		public String query17() {
			List<User1Entity> list = repo.findUser1EntityByAgeGreaterThanOrderByAgeDesc(15);
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query18")
		public String query18() {
			int count = repo.countUser1EntityByUid("A102");
			System.out.println("count = " + count);
			return "redirect:/";
		}
		
		@GetMapping("/query19")
		public String query19() {
			int count = repo.countUser1EntityByName("이순신");
			System.out.println("count = " + count);
			return "redirect:/";
		}
		
		@GetMapping("/query20")
		public String query20() {
			List<User1Entity> list = repo.selectUser1UnderAge30();
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query21")
		public String query21() {
			List<User1Entity> list = repo.selectUser1ByName("이순신");
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query22")
		public String query22() {
			List<User1Entity> list = repo.selectUser1ByNameParam("이순신");
			System.out.println(list);
			return "redirect:/";
		}
		
		@GetMapping("/query23")
		public String query23() {
			List<Object[]> result = repo.selectUser1ByUid("A102");
			
			for(Object[] obj : result) {
				
				System.out.println("obj[0] : " + obj[0]);
				System.out.println("obj[1] : " + obj[1]);
				System.out.println("obj[2] : " + obj[2]);
					
			}
 			return "redirect:/";
		}
		
		
}
