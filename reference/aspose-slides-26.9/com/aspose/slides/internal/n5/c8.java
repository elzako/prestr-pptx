package com.aspose.slides.internal.n5;

public class c8 implements y2 {
   protected String n5;
   protected int l6;
   protected int k5;
   protected int u3;
   protected int a6 = 0;
   protected int u9;

   public c8(int var1) {
      this.l6 = var1;
   }

   @Override
   public int n5() {
      return this.l6;
   }

   @Override
   public void n5(int var1) {
      this.k5 = var1;
   }

   @Override
   public String l6() {
      return this.n5;
   }

   @Override
   public void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public int k5() {
      return this.k5;
   }

   @Override
   public int u3() {
      return this.u3;
   }

   @Override
   public void l6(int var1) {
      this.u3 = var1;
   }

   @Override
   public int a6() {
      return this.a6;
   }

   @Override
   public void k5(int var1) {
      this.a6 = var1;
   }

   @Override
   public void u3(int var1) {
      this.l6 = var1;
   }

   @Override
   public int u9() {
      return this.u9;
   }

   @Override
   public void a6(int var1) {
      this.u9 = var1;
   }

   @Override
   public String toString() {
      String var1 = "";
      if (this.a6 > 0) {
         var1 = ",channel=" + this.a6;
      }

      String var2 = this.l6();
      if (var2 != null) {
         var2 = var2.replaceAll("\n", "\\\\n");
         var2 = var2.replaceAll("\r", "\\\\r");
         var2 = var2.replaceAll("\t", "\\\\t");
      } else {
         var2 = "<no text>";
      }

      return "[@" + this.u9() + ",'" + var2 + "',<" + this.l6 + ">" + var1 + "," + this.k5 + ":" + this.u3() + "]";
   }
}
