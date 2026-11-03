package com.aspose.slides.internal.g7;

public class n2 {
   int n5;
   p9[] l6;
   p0 k5;
   p0 u3;
   String a6;
   String u9;

   n2() {
   }

   public n2(int var1, String var2, z4 var3) {
      this(var1, new p9(var2, var3));
   }

   public n2(int var1, z4 var2) {
      this(var1, new p9(var2));
   }

   public n2(int var1, p9 var2) {
      this(var1, new p9[]{var2});
   }

   public n2(String var1, String var2, int var3, p9 var4) {
      this(var1, var2, var3, new p9[]{var4});
   }

   public n2(int var1, p9[] var2) {
      this(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, var1, var2);
   }

   public n2(String var1, String var2, int var3, p9[] var4) {
      this.k5 = new p0(var1);
      this.a6 = var1;
      this.u3 = new p0(var2);
      this.u9 = var2;
      this.n5 = var3;
      this.l6 = var4;
   }

   public n2(p0 var1, p0 var2, int var3, p9 var4) {
      this(var1, var2, var3, new p9[]{var4});
   }

   public n2(p0 var1, p0 var2, int var3, p9[] var4) {
      this.k5 = var1;
      this.u3 = var2;
      this.a6 = var1.n5();
      this.u9 = var2.n5();
      this.n5 = var3;
      this.l6 = var4;
   }

   public String n5() {
      return this.a6;
   }

   public final int l6() {
      return this.n5;
   }

   public final p9[] k5() {
      return this.l6;
   }
}
