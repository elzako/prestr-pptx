package com.aspose.slides;

class w2z {
   private final String n5;
   private final int l6;
   private final byte k5;
   private final boolean u3;
   private boolean a6;
   private String u9;

   public w2z(String var1, int var2, byte var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = false;
   }

   public w2z(String var1, int var2, boolean var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = 0;
      this.u3 = true;
      this.a6 = var3;
   }

   public final String n5() {
      return this.n5;
   }

   public final boolean l6() {
      return this.u3;
   }

   public final int k5() {
      return this.l6;
   }

   public final byte u3() {
      return this.k5;
   }

   public final String a6() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }

   @Override
   public String toString() {
      return this.n5();
   }
}
