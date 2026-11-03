package com.aspose.slides.internal.r7c;

public class l6 extends n5 {
   private boolean u3;
   private String a6;
   protected String n5;
   private String u9;
   protected int l6 = 0;
   static l6 k5 = new l6("", false);

   public l6(String var1, boolean var2) {
      this(var1, "", var2);
   }

   l6(String var1, String var2, boolean var3) {
      super(var1);
      this.a6 = var1;
      this.u3 = var3;
      this.n5 = var2;
   }

   public l6(String var1, String var2, String var3, boolean var4, int var5) {
      super(var1);
      this.a6 = var1;
      this.u3 = var4;
      this.l6 = var5;
      this.u9 = var2;
      this.n5 = var3;
   }

   public boolean u3() {
      return this.u3;
   }

   @Override
   public String k5() {
      return this.a6;
   }

   @Override
   public int l6() {
      return this.a6.length();
   }
}
