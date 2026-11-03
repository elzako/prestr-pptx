package com.aspose.slides.internal.z8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.x8.b3;
import com.aspose.slides.internal.x8.g7;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class l6 implements t9 {
   private Stack<com.aspose.slides.internal.k5.q0> n5;
   private com.aspose.slides.internal.h0.q0 l6;
   private com.aspose.slides.internal.h0.l6 k5;
   private com.aspose.slides.internal.h0.h0 u3;
   private e2 a6;
   private com.aspose.slides.internal.j3.z8 u9;

   public l6(e2 var1, com.aspose.slides.internal.h0.h0 var2, com.aspose.slides.internal.j3.z8 var3) {
      this.a6 = var1;
      this.u3 = var2;
      this.u9 = var3;
      this.n5 = new Stack<>();
   }

   public final com.aspose.slides.internal.k5.j5 n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.k5.q0 l6() {
      return this.n5.size() == 0 ? null : this.n5.peek();
   }

   public final void n5(com.aspose.slides.internal.k5.q0 var1) {
      this.n5.push(var1);
   }

   @Override
   public final void k5() {
      if (this.u9 != null) {
         com.aspose.slides.internal.k5.y2 var1 = (com.aspose.slides.internal.k5.y2)this.u9.c4().u9();
         this.l6 = (com.aspose.slides.internal.h0.q0)var1.n5(d1.n5, "all");
      } else {
         this.l6 = new com.aspose.slides.internal.h0.q0();
      }

      this.l6.n5(this.u3, this.u9);
   }

   @Override
   public final void u3() {
   }

   @Override
   public final void a6() {
      this.n5(this.a6.n5().n5((short)1, this.l6, this.l6()));
      this.k5 = (com.aspose.slides.internal.h0.l6)((com.aspose.slides.internal.h0.t4)this.l6()).u9();
   }

   @Override
   public final void u9() {
      com.aspose.slides.internal.k5.q0 var1 = this.n5.pop();
      if (this.n5.size() == 0) {
         ((com.aspose.slides.internal.h0.e2)this.l6.l6()).n5(var1);
      } else {
         com.aspose.slides.internal.k5.q0 var2 = this.l6();
         switch (var2.n5()) {
            case 4:
               ((com.aspose.slides.internal.h0.e2)((com.aspose.slides.internal.h0.x8)var2).u9()).n5(var1);
         }
      }

      if (var1.n5() == 1) {
         this.k5 = null;
      }
   }

   @Override
   public final void n5(IGenericList<com.aspose.slides.internal.c8.l6> var1) {
      com.aspose.slides.internal.h0.x8 var2 = (com.aspose.slides.internal.h0.x8)this.a6.n5().n5((short)4, this.l6, this.l6());
      com.aspose.slides.internal.h0.w1 var3 = var2.h0();
      IGenericEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.c8.l6 var5 = (com.aspose.slides.internal.c8.l6)var4.next();
            var3.n5(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.n5(var2);
   }

   @Override
   public final void h0() {
      com.aspose.slides.internal.k5.q0 var1 = this.a6.n5().n5((short)5, this.l6, this.l6());
      this.k5 = (com.aspose.slides.internal.h0.l6)((com.aspose.slides.internal.h0.t2)var1).k5();
      this.n5(var1);
   }

   @Override
   public final void n5(String var1, String var2) {
      this.l6.a6().n5(var1, var2);
   }

   @Override
   public final void n5(String var1) {
      com.aspose.slides.internal.h0.u9 var2 = (com.aspose.slides.internal.h0.u9)this.a6.n5().n5((short)11, this.l6, this.l6());
      var2.n5(var1);
      this.n5(var2);
   }

   @Override
   public final void l6(String var1) {
      com.aspose.slides.internal.k5.x8 var2 = (com.aspose.slides.internal.k5.x8)this.a6.n5().n5((short)2, this.l6, this.l6());
      var2.n5(var1);
      this.n5(var2);
   }

   @Override
   public final void n5(String var1, IGenericList<com.aspose.slides.internal.c8.l6> var2) {
      com.aspose.slides.internal.h0.s7 var3 = (com.aspose.slides.internal.h0.s7)this.a6.n5().n5((short)3, this.l6, this.l6());
      var3.n5(var1);
      com.aspose.slides.internal.h0.w1 var4 = var3.c8();
      IGenericEnumerator var5 = var2.iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.c8.l6 var6 = (com.aspose.slides.internal.c8.l6)var5.next();
            var4.n5(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      this.n5(var3);
   }

   @Override
   public final void c8() {
      com.aspose.slides.internal.k5.t4 var1 = (com.aspose.slides.internal.k5.t4)this.a6.n5().n5((short)6, this.l6, this.l6());
      this.k5 = (com.aspose.slides.internal.h0.l6)var1.u9();
      this.n5(var1);
   }

   @Override
   public final void k5(String var1) {
      com.aspose.slides.internal.k5.r4 var2 = (com.aspose.slides.internal.k5.r4)this.a6.n5().n5((short)0, this.l6, this.l6());
      var2.l6(var1);
      this.n5(var2);
   }

   @Override
   public final void n5(com.aspose.slides.internal.k5.j5 var1) {
      com.aspose.slides.internal.h0.s7 var2 = com.aspose.slides.internal.v6g.k5.n5(this.l6(), com.aspose.slides.internal.h0.s7.class);
      ((com.aspose.slides.internal.h0.q0)var1).n5(this.l6);
      if (var2 == null) {
         this.u3.u3().n5(new u3(d1.n5("CSS Rule '{0}' is not supported embedded stylesheets.", new Object[]{this.l6().n5()})));
      } else {
         ((com.aspose.slides.internal.h0.q0)var1).n5(this.l6());
         var2.n5(var1);
      }
   }

   @Override
   public final void n5(b3[] var1) {
      com.aspose.slides.internal.k5.q0 var2 = this.l6();

      for (b3 var6 : var1) {
         if (var2.n5() == 1) {
            ((com.aspose.slides.internal.h0.t4)var2).h0().n5((g7)var6);
         } else if (var2.n5() == 6) {
            ((com.aspose.slides.internal.h0.n3)var2).h0().n5((g7)var6);
         }
      }
   }

   @Override
   public final void n5(String var1, y4 var2, boolean var3) {
      int var4 = this.u3.l6(d1.a6(var1));
      if (var4 != -1) {
         com.aspose.slides.internal.n3.m1 var5 = this.u3.u9(var4);
         if (!this.u3.c8(var4)) {
            com.aspose.slides.internal.k5.u9 var6 = var5.n5(var2, this.u3);
            if (var6.h0() != 2 && var2.k5() != null) {
               throw com.aspose.slides.internal.z8.u9.u3(var1);
            }

            this.k5.n5(var4, var6, var3);
         } else {
            com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.n3.e2.class).n5(this.u3, this, var2, var3);
         }
      } else {
         this.u3.u3().n5(new u3(d1.n5("Invalid property name '{0}'.", new Object[]{var1})));
      }
   }
}
