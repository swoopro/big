package 전체검색;

import javax.swing.JOptionPane;

public class MovieMain {

	public static void main(String[] args) {
		String sid = JOptionPane.showInputDialog("검색할 ID입력: ");
		
		MovieDAO dao = new MovieDAO();
		try {	
			MovieDTO dto = dao.select(sid); //dto 는변수명 바꿔줘도상없.
			//sid를넣어준 select의 리턴값이 dto이고 타입은 MemberDTO 적어준거
			//여기서 MemberDTO는 복사한게아니라 반환타입을 적은거
			JOptionPane.showMessageDialog(null, dto.getId());
			JOptionPane.showMessageDialog(null, dto.getTitle());
			JOptionPane.showMessageDialog(null, dto.getCompany());
			JOptionPane.showMessageDialog(null, dto.getActor());
			
		} catch (Exception e) {
		}
	}

}
