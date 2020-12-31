package Doit_chap04;

public class IntStack {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int[] stk; // 스택 본체

	// 실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {

		}
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {

		}
	}

	// 생성자
	public IntStack(int capacity) {
		ptr = 0; // 생성 시 스택이 비어있으므로 포인터 ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 스택에 x를 푸쉬
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) // 스택이 가득참
			throw new OverflowIntStackException(); // 스택이 가득차서 푸쉬를 할 수 없는 경우 예외 OverflowIntStackException 던진다(throw).
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) // 스택이 비어서 팝을 할 수 없는 경우 예외 처리
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다 봄)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) // 스택이 비어있는 경우 예외처리
			throw new EmptyIntStackException();
		return stk[ptr - 1]; // 스택이 비어있지 않는 경우 꼭대기 요소 반환
	}

	// 검색메서드 (indexOf) : 스택본체의 값이 어디에 들어있는지를 조사하는 메서드 (검색은 꼭대기 -> 바닥)
	// 스택의 모든 요소를 삭제하는 메서드(clear) : 스택에 쌓여있는 데이터를 모두 삭제하는 메서드
	// 용량을 확인하는 메서드(capacity) : 스택의 용량(max의 값)을 반환하는 메서드
	// 데이터 수를 확인하는 메서드(size) : 현재 스택에 쌓여 있는 데이터 수(ptr 값)를 반환하는 메서드
	// 스택이 비어 있는지 검사하는 메서드(IsEmpty) : 스택이 비어있으면 true, 그렇지 않으면 false
	// 스택이 가득 찼는지 검사하는 메서드(IsFull) : 스택이 가득찼으면 true, 그렇지 않으면 false

	// 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == x)
				return i;
		}
		return -1;
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안에 있는 모든 데이터를 표시하는 메서드 (dump)
	// 스택 안에 모든 데이터를 바닥 -> 꼭대기 순으로 입력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
