package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e5.d5;
import com.aspose.slides.ms.System.d1;

public abstract class y2 extends k7 {
   private com.aspose.slides.internal.h2.t2 s7;
   protected boolean c8 = false;
   protected boolean t2 = false;
   private boolean z1 = true;
   private boolean t4 = false;
   private boolean q0 = true;
   private List<List<List<c8>>> z3 = new List<>();

   public y2(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   protected Object clone() {
      y2 var1 = (y2)super.clone();
      var1.z3 = new List<>(this.z3);
      return var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.s7 = var1.u3();
      super.n5(var1);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, com.aspose.slides.internal.e5.w1 var4) {
      super.n5(var1, var2, var3, var4);
      if (!this.p_()) {
         z1 var5 = this.e5();
         if (var5.b3()) {
            int var6 = var5.v4();
            this.u9 = new List<>(var6);

            for (int var7 = 0; var7 < var6; var7++) {
               this.u9.addItem(null);
            }
         } else {
            this.u9 = new List<>();
         }

         this.h0 = new k5();
      }
   }

   @Override
   public void r_() {
      if (!this.p_()) {
         this.u9 = null;
         this.h0 = null;
      }

      if (!this.c8 && !this.t2) {
         this.n5("marker* (table-row+|table-cell+)", true);
         this.s_().l6(this);
      } else {
         this.o0();
      }
   }

   @Override
   public y2 b3() {
      return this;
   }

   protected final void o0() {
      if (!this.p_()) {
         e2 var1 = this.e5().j4();
         if (this.c8) {
            var1.n5();
         } else if (!this.q0) {
            var1.n5(this);
         }

         try {
            var1.l6();
         } catch (d5 var3) {
            var3.n5(this.k5);
            throw var3;
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.c8 || this.t2) {
               this.l6(var1, "fo:marker", "(table-row+|table-cell+)");
            }
         } else if (d1.a6(var3, "table-row")) {
            this.c8 = true;
            if (this.t2) {
               x8 var4 = j5.n5(this.q_().m1());
               var4.n5(this, this.t9(), this.m_());
            }
         } else if (d1.a6(var3, "table-cell")) {
            this.t2 = true;
            if (this.c8) {
               x8 var5 = j5.n5(this.q_().m1());
               var5.n5(this, this.t9(), this.m_());
            }
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.t2 var1) {
      if (!this.p_()) {
         switch (var1.z3()) {
            case 75:
               if (!this.t4) {
                  this.e5().j4().l6(this);
               }

               this.t4 = true;
               m1 var2 = (m1)var1;
               this.n5(var2, this.z1);
               this.q0 = var2.f0();
               if (this.q0) {
                  this.z1 = false;
                  this.h0.n5(this.u9);
                  this.e5().j4().n5(this);
               }
               break;
            case 79:
               if (!this.t4) {
                  this.e5().j4().l6(this);
               } else {
                  this.h0.n5(this.u9);
                  this.e5().j4().n5();
               }

               this.t4 = true;
               this.e5().j4().n5((y1)var1);
         }
      }

      super.n5(var1);
   }

   public final void n5(List<List<c8>> var1) {
      this.z3.addItem(var1);
   }

   public final List<List<List<c8>>> z7() {
      return this.z3;
   }

   @Override
   public com.aspose.slides.internal.h2.t2 x9() {
      return this.s7;
   }

   public final boolean n5(y1 var1) {
      return this.u3 == null || this.u3 == var1;
   }

   public final void v4() {
      if (this.t4) {
         this.z1 = false;
         if (!this.q0) {
            this.h0.n5(this.u9);
            this.e5().j4().n5(this);
         }
      }
   }
}
