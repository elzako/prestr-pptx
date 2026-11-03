package com.aspose.slides.internal.i4;

public class j4 extends y1 {
   private Object n5;

   @Override
   public g7 u3(g7 var1) {
      return this.n5(var1);
   }

   @Override
   public String u3() {
      return "Object";
   }

   @Override
   public String c8() {
      return "object";
   }

   @Override
   public Object C_() {
      return this.n5;
   }

   @Override
   public void n5(Object var1) {
      this.n5 = var1;
   }

   @Override
   public g7 l6(j9 var1) {
      if (this.C_() != null && !com.aspose.slides.internal.v6g.k5.l6(this.C_(), Comparable.class)) {
         return var1.c4().u9(this.C_().toString());
      }

      switch (com.aspose.slides.ms.System.z3.e2(this.C_())) {
         case 1:
         case 4:
         case 18:
            return var1.c4().u9(this.C_().toString());
         case 2:
         case 17:
         default:
            return l5.n5;
         case 3:
            return var1.t9().n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(this.C_(), boolean.class)));
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            return var1.w1().n5(com.aspose.slides.ms.System.z3.n3(this.C_()));
         case 16:
            return var1.z1().n5(com.aspose.slides.internal.v6g.k5.u3(this.C_(), com.aspose.slides.ms.System.j5.class).m3());
      }
   }

   @Override
   public boolean n5() {
      if (this.C_() != null && !com.aspose.slides.internal.v6g.k5.l6(this.C_(), com.aspose.slides.ms.System.u6.class)) {
         return true;
      }

      if (this.C_() == null) {
         return true;
      }

      switch (com.aspose.slides.ms.System.z3.e2(this.C_())) {
         case 1:
            return com.aspose.slides.ms.System.z3.n5(this.C_());
         case 2:
         case 17:
         default:
            return true;
         case 3:
            return com.aspose.slides.internal.v6g.k5.u3(this.C_(), boolean.class);
         case 4:
         case 18:
            return i9.u9((String)this.C_());
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            return k8.n5(com.aspose.slides.ms.System.z3.n3(this.C_()));
         case 16:
            return k8.n5(w1.n5(com.aspose.slides.internal.v6g.k5.u3(this.C_(), com.aspose.slides.ms.System.j5.class).m3()));
      }
   }

   @Override
   public double l6() {
      if (this.C_() == null) {
         return 0.0;
      }

      if (!this.l6(this.C_())) {
         return Double.NaN;
      }

      switch (com.aspose.slides.ms.System.z3.e2(this.C_())) {
         case 3:
            return y4.n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(this.C_(), boolean.class)));
         case 4:
         case 18:
            return i9.h0((String)this.C_());
         case 16:
            return w1.n5(com.aspose.slides.internal.v6g.k5.u3(this.C_(), com.aspose.slides.ms.System.j5.class).m3());
         default:
            return com.aspose.slides.ms.System.z3.n3(this.C_());
      }
   }

   @Override
   public String toString() {
      if (this.n5 == null) {
         return null;
      } else {
         return this.l6(this.C_()) ? com.aspose.slides.ms.System.z3.y4(this.C_()) : this.n5.toString();
      }
   }

   private boolean l6(Object var1) {
      return var1 instanceof com.aspose.slides.ms.System.u6
         || var1 instanceof Number
         || var1 instanceof Boolean
         || var1 instanceof Character
         || var1 instanceof String
         || var1 instanceof com.aspose.slides.ms.System.j5;
   }

   public j4() {
   }

   public j4(Object var1, j4 var2) {
      super(var2);
      this.n5 = var1;
   }

   public j4(j4 var1) {
      super(var1);
   }
}
