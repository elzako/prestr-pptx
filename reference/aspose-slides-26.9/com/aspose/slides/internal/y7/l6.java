package com.aspose.slides.internal.y7;

class l6 extends Number {
   private String n5;
   private boolean l6;

   l6(String var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public double doubleValue() {
      return Double.parseDouble(this.n5);
   }

   @Override
   public float floatValue() {
      return Float.parseFloat(this.n5);
   }

   @Override
   public int intValue() {
      return this.l6 ? (int)Double.parseDouble(this.n5) : Integer.parseInt(this.n5);
   }

   @Override
   public long longValue() {
      return this.l6 ? (long)Double.parseDouble(this.n5) : Long.parseLong(this.n5);
   }

   @Override
   public String toString() {
      return this.n5;
   }
}
