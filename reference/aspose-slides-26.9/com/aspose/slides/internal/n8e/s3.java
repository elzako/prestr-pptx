package com.aspose.slides.internal.n8e;

class s3 extends RuntimeException {
   private String n5;
   private int l6;
   private String[] k5;

   public s3() {
   }

   public s3(int var1, String[] var2, String var3, Throwable var4) {
      super(var3, var4);
      this.n5 = var3;
      this.l6 = var1;
      this.k5 = var2;
   }

   public s3(int var1, String var2) {
      super(var2);
      this.n5 = var2;
      this.l6 = var1;
   }

   public s3(int var1, String[] var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   public String getMessage() {
      return this.n5;
   }

   public int n5() {
      return this.l6;
   }
}
