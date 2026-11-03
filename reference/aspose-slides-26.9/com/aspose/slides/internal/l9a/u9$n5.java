package com.aspose.slides.internal.l9a;

import java.util.Arrays;

public class u9$n5 {
   private short[] n5;
   private final int l6;

   public u9$n5(short[] var1) {
      this.n5 = var1;
      this.l6 = Arrays.hashCode(var1);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         u9$n5 var2 = (u9$n5)o;
         return Arrays.equals(this.n5, var2.n5);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.l6;
   }
}
