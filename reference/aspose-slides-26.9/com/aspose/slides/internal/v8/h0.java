package com.aspose.slides.internal.v8;

import com.aspose.slides.internal.l7h.a5;

public class h0 {
   public int n5;
   public com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   public int k5;

   public h0(int var1, int var2, com.aspose.slides.internal.o9b.c8 var3) {
      this.n5 = var1;
      this.k5 = var2;
      var3.n5(this.l6);
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      if (obj == this) {
         return true;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(obj, h0.class)) {
         return false;
      }

      h0 var2 = (h0)obj;
      return this.n5 == var2.n5 && this.l6.equals(var2.l6.o8()) && this.k5 == var2.k5;
   }

   private String n5() {
      return com.aspose.slides.internal.v8.l6.n5(this.n5).n5();
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5('(');
      var1.n5(this.n5());
      var1.n5(',');
      var1.n5(com.aspose.slides.internal.v3.k5.n5(this.l6.o8()));
      var1.n5(',');
      var1.k5(this.k5);
      var1.n5(')');
      return var1.toString();
   }
}
