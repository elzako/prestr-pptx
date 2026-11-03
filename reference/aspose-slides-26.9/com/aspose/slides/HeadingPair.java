package com.aspose.slides;

public final class HeadingPair implements IHeadingPair {
   private String n5;
   private int l6;

   @Override
   public final String getName() {
      return this.n5;
   }

   final void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public final int getCount() {
      return this.l6;
   }

   final void n5(int var1) {
      this.l6 = var1;
   }

   HeadingPair(String name, int count) {
      this.n5(count);
      this.n5(name);
   }
}
