private String name;
public void setName (String name) {
  if (name == null){
    throw new IllgalArgumentException("名前がnullである。処理を中断。");
  }
  if (name.length() <= 1){
    throw new IllegalArgumentExceotion("名前が短すぎる。処理を中断。");
  }
  if (name.length() >= 8){
    throw new IllegalArgumentExceotion("名前が長すぎる。処理を中断。");
  }
  this.name
}