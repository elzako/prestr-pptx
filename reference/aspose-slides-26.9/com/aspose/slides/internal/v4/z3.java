package com.aspose.slides.internal.v4;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.h2.b3;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class z3 extends t4 {
   private com.aspose.slides.internal.f2.k5 c8;
   private int t2;
   private com.aspose.slides.internal.f2.k5 s7;
   private int x8;
   private int n3;
   private b3 y4;
   private int e2;
   private com.aspose.slides.internal.f2.k5 t9;
   private int z1;
   private com.aspose.slides.internal.f2.k5 t4;

   public z3(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.c8 = var1.u3(3).c8();
      this.t2 = var1.u3(4).a6();
      this.s7 = var1.u3(15).c8();
      this.x8 = var1.u3(88).a6();
      this.n3 = var1.u3(136).a6();
      this.y4 = var1.u3(137).k_();
      this.e2 = var1.u3(138).a6();
      this.t9 = var1.u3(139).c8();
      this.t4 = l6(214).n5(var1).c8();
      switch (this.e2) {
         case 123:
            this.z1 = var1.u3(213).a6();
            this.t4 = var1.u3(214).c8();
         case 35:
         case 134:
         case 158:
            return;
         default:
            throw new Exception(d1.n5(new String[]{"Invalid leader pattern: ", a3.l6(this.e2)}));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)
         && (
            d1.a6(var3, "leader")
               || d1.a6(var3, "inline-container")
               || d1.a6(var3, "block-container")
               || d1.a6(var3, "float")
               || d1.a6(var3, "marker")
               || !this.k5(var2, var3)
         )) {
         this.k5(var1, var2, var3);
      }
   }

   public final int e5() {
      return this.z1;
   }

   public final com.aspose.slides.internal.f2.k5 b3() {
      return this.t4;
   }

   public final b3 o0() {
      return this.y4;
   }

   public final int z7() {
      return this.e2;
   }

   public final com.aspose.slides.internal.f2.k5 v4() {
      return this.t9;
   }

   public final com.aspose.slides.internal.f2.k5 u6() {
      return this.c8;
   }

   public final int t1() {
      return this.t2;
   }

   public final com.aspose.slides.internal.f2.k5 a5() {
      return this.s7;
   }

   public final int h2() {
      return this.x8;
   }

   @Override
   public String z1() {
      return "leader";
   }

   @Override
   public int z3() {
      return 39;
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   @Override
   public void c8() {
      super.c8();
      this.n_().l6(this);
   }

   @Override
   protected Stack<com.aspose.slides.internal.d5.u3> n5(Stack<com.aspose.slides.internal.d5.u3> var1, com.aspose.slides.internal.d5.u3 var2) {
      if (var2 != null) {
         if (this.e2 == 158) {
            var1 = super.n5(var1, var2);
         } else {
            var2.n5('￼', this);
         }
      }

      return var1;
   }
}
