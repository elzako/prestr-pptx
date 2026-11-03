package com.aspose.slides.internal.q9r;

import java.util.Arrays;

public class a0 extends k7 {
   private final byte[] n5;

   public final byte[] n5() {
      return this.n5;
   }

   public a0(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public com.aspose.slides.internal.z0k.t4 l6() {
      return new com.aspose.slides.internal.z0k.e2(this.n5());
   }

   @Override
   public boolean k5() {
      return this.n5() != null;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         a0 var2 = (a0)o;
         return Arrays.equals(this.n5, var2.n5);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? Arrays.hashCode(this.n5) : 0;
   }
}
