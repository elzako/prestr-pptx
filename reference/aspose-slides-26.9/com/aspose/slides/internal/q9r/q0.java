package com.aspose.slides.internal.q9r;

public class q0 extends k7 {
   private final String n5;

   public final String n5() {
      return this.n5;
   }

   public q0(String var1) {
      this.n5 = var1;
   }

   @Override
   public com.aspose.slides.internal.z0k.t4 l6() {
      return com.aspose.slides.internal.z0k.u9.u3(this.n5());
   }

   @Override
   public boolean k5() {
      return this.n5() == null ? false : com.aspose.slides.internal.z0k.u9.k5(this.n5());
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         q0 var2 = (q0)o;
         return this.n5 != null ? this.n5.equals(var2.n5) : var2.n5 == null;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }
}
