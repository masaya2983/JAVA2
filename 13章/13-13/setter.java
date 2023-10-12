private String name;
public void setName (String name) {
  if (name == null){
    throw new IllgalArgumentException("名前がnullである。処理を中断。")
  }
}