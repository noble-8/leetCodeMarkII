class Solution:
    def evalRPN(self, arr: List[str]) -> int:
        ans = 0
        st = []
        for i in range(len(arr)):
            if arr[i]=="+" or arr[i]=="-" or arr[i]=="*" or arr[i]=="/":
                if arr[i]=="+":
                    st.append(int(st.pop()) + int(st.pop()))
                elif arr[i]=="-":
                    first = int(st.pop())
                    second = int(st.pop())
                    st.append(second - first)
                elif arr[i]=="*":
                    st.append(int(st.pop())*int(st.pop()))
                else:
                    first = int(st.pop())
                    second = int(st.pop())
                    st.append(int(second/first))
            else:
                st.append(int(arr[i]))
            # print(st)
        return st.pop()
