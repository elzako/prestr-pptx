package com.aspose.slides.ms.System;

public abstract class d5$u3 extends d5 {
   private long n5;
   private String l6;

   @Override
   public int hashCode() {
      return (int)this.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof d5$u3)) {
         return false;
      }

      d5$u3 var2 = (d5$u3)obj;
      return var2.n5 == this.n5 && d1.a6(var2.l6, this.l6);
   }
}
