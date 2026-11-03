package com.aspose.slides.internal.l7h;

public final class s3 extends t2 {
   public j5 n5 = null;
   public char[] l6 = null;
   public char k5 = '?';

   public s3(j5 var1) {
      this.n5 = var1;
   }

   @Override
   public s7 n5() {
      return new p8(this);
   }

   @Override
   public int l6() {
      return 1;
   }

   @Override
   public boolean equals(Object value) {
      s3 var2 = com.aspose.slides.internal.v6g.k5.n5(value, s3.class);
      return var2 != null ? this.n5.t9() == var2.n5.t9() : false;
   }

   @Override
   public int hashCode() {
      return this.n5.t9();
   }
}
