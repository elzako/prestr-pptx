package com.aspose.slides.internal.f5;

import com.aspose.slides.ms.System.d1;

public class l6 extends y1<n5> implements com.aspose.slides.internal.j3.u3 {
   l6(z3 var1) {
      super(var1, (short)5);
   }

   @Override
   public final boolean n5(String var1) {
      return this.u3(var1) != null;
   }

   @Override
   public final com.aspose.slides.internal.j3.k5 l6(String var1) {
      return com.aspose.slides.internal.v6g.k5.n5(this.u3(var1), n5.class);
   }

   public final n5 n5(n5 var1) {
      this.l6(var1);
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(var1), n5.class);
   }

   @Override
   public final com.aspose.slides.internal.j3.k5 n5(com.aspose.slides.internal.j3.k5 var1) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(var1, n5.class));
   }

   public final com.aspose.slides.internal.j3.k5 k5(String var1) {
      return com.aspose.slides.internal.v6g.k5.n5(this.a6(var1), n5.class);
   }

   public final com.aspose.slides.internal.j3.k5 l6(com.aspose.slides.internal.j3.k5 var1) {
      for (int var2 = 0; var2 < this.n5(); var2++) {
         if (this.n5(var2) == var1) {
            this.l6(var2);
            return var1;
         }
      }

      return null;
   }

   public final com.aspose.slides.internal.j3.k5 n5(String var1, String var2) {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(var1, var2), n5.class);
   }

   public final com.aspose.slides.internal.j3.k5 k5(com.aspose.slides.internal.j3.k5 var1) {
      this.l6(com.aspose.slides.internal.v6g.k5.n5(var1, n5.class));
      return (com.aspose.slides.internal.j3.k5)this.u3(com.aspose.slides.internal.v6g.k5.n5(var1, n5.class));
   }

   public final com.aspose.slides.internal.j3.k5 l6(String var1, String var2) {
      return com.aspose.slides.internal.v6g.k5.n5(this.u3(var1, var2), n5.class);
   }

   private void l6(n5 var1) {
      if (d1.a6(var1.x8(), "xmlns")) {
         var1.y4().u3().n5(var1.t2(), var1.k5());
      }
   }
}
