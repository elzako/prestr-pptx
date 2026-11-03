package com.aspose.slides.internal.b8c;

class t4$n5 implements Comparable {
   private String n5;
   private t4 l6;
   private int k5;

   public t4$n5(String var1, t4 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public t4$n5(String var1, t4 var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public static t4 n5(t4$n5 var0) {
      return var0.l6;
   }

   public final String n5() {
      return this.n5;
   }

   public final int l6() {
      return this.k5;
   }

   @Override
   public final int compareTo(Object obj) {
      return com.aspose.slides.ms.System.d1.a6(this.n5, (String)obj, (short)4);
   }
}
