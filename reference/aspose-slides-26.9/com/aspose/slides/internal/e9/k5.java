package com.aspose.slides.internal.e9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.a0.e2;
import com.aspose.slides.internal.a0.s3$k5;
import com.aspose.slides.internal.a0.s3$l6;
import com.aspose.slides.internal.a0.t2;
import com.aspose.slides.internal.d2.t9;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.m1;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.e1.z1;
import com.aspose.slides.internal.e1.z3;
import com.aspose.slides.internal.h2.z8;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.internal.r4.x8;
import com.aspose.slides.internal.v0.n3;
import com.aspose.slides.internal.w0.c8;
import com.aspose.slides.internal.w0.s7;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class k5 extends com.aspose.slides.internal.z6.u3 {
   protected double e2 = 1.0;
   protected int t9 = 0;
   protected int z1 = 0;
   protected List<o5> t4 = new List<>();
   private int m3 = 0;
   protected boolean q0 = true;
   protected boolean z3 = true;
   protected boolean m1 = false;
   private boolean z8;
   private r4 j5 = null;
   private w1 w1 = com.aspose.slides.internal.o9b.w1.n5.u3();
   private List<com.aspose.slides.internal.e1.w1> r4 = new List<>();
   private boolean c4 = true;
   private t4 y2;
   private Stack<k5$n5> y1 = new Stack<>();
   protected Stack<String> k7 = new Stack<>();
   private y1 a0 = com.aspose.slides.internal.o9b.y1.n5.y4();
   private boolean d2 = false;
   private Stack<z3> d5 = new Stack<>();
   private List<com.aspose.slides.internal.j8.u3> s3 = new List<>();
   private com.aspose.slides.internal.j8.l6 p8 = new com.aspose.slides.internal.j8.l6();
   private boolean f2 = false;
   private com.aspose.slides.internal.h2.l6 i1 = null;
   private s7[][] e5 = new s7[4][];
   private Dictionary<m3, Boolean> b3 = new Dictionary<>();

   private c8 z3() {
      if (this.y1.size() == 0) {
         return new c8();
      }

      c8 var1 = this.t4().u3() != null ? this.t4().u3().k5() : new c8();

      for (k5$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(this.t4().y2(), k5$n5.class);
         var2 != null;
         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.y2(), k5$n5.class)
      ) {
         if (var2.u3() != null) {
            var1.n5(var2.u3().k5(), 1);
         }
      }

      float var3 = (this.r4.size() - 1) * this.r4.get_Item(0).k5();
      if (var3 > 0.0F) {
         var1.n5(new c8(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, var3), 1);
      }

      return var1;
   }

   protected final void n5(String var1, y1 var2) {
      z3 var3 = new z3();
      var3.k5(var1);
      if (var3.j5().length() > 0) {
         this.k7.push(var1);
      }

      if (this.l6.t2 != null && var1.length() > 0) {
         if (this.l6.t2.containsKey(var3.j5())) {
            this.l6.t2.set_Item(d1.n5(new String[]{var3.j5(), "_", a3.l6(this.m3)}), this.z3().n5(var2.y4()).y4());
         } else {
            this.l6.t2.set_Item(var3.j5(), this.z3().n5(var2.y4()).y4());
         }
      }

      var3.n5((Object)Integer.valueOf(0));
      if (this.d5.size() > 0) {
         this.d5.peek().n5(var3);
      }

      this.d5.push(var3);
   }

   protected final z3 z1() {
      z3 var1 = this.d5.pop();
      if (var1.j5().length() > 0) {
         this.k7.pop();
      }

      if (var1 != null && 0 == com.aspose.slides.internal.v6g.k5.u3(var1.n5(), int.class) + var1.t2()) {
         this.t4().n5(var1);
      }

      return var1;
   }

   public final k5$n5 t4() {
      return this.y1.peek();
   }

   private void n5(k5$n5 var1) {
      var1.n5(this.h0);
      if (var1.u3() == null) {
         var1.n5(new c8());
      }

      if (this.y1.size() > 0) {
         this.t4().n5(var1);
      } else {
         this.r4.get_Item(this.m3).n5(var1);
      }

      this.y1.push(var1);
   }

   private void m1() {
      this.y1.pop();
   }

   protected final String l6(com.aspose.slides.internal.a0.l6 var1) {
      return var1.u9(8) ? (String)var1.a6(8) : d1.n5;
   }

   @Override
   protected void k5(t2 var1) {
      String var2 = this.l6((com.aspose.slides.internal.a0.l6)var1);
      y1 var3 = new y1(this.u3 / 1000.0F, this.k5.n5() / 1000.0F, var1.l6() / 1000.0F, var1.e_() / 1000.0F);
      c8 var4 = new c8();
      var4.l6(var1.y1() / 1000.0F, var1.d5() / 1000.0F);
      var4.l6(0.0F, var1.e2() / 1000.0F);
      y1 var5 = var4.n5(var3.y4()).y4();
      y1 var6 = var5.y4();
      if (d1.l6(var2, "td_") || d1.l6(var2, "th_")) {
         var6 = new y1(var6.x8() - var1.n3() / 1000.0F, var6.n3(), var1.f_() / 1000.0F, var1.a6() / 1000.0F);
      }

      this.n5(var2, var6.y4());
      this.l6(var5.y4()).a6(var5);

      try {
         super.k5(var1);
         this.n5(var1, var5.y4());
      } finally {
         this.z1();
      }
   }

   public k5(com.aspose.slides.internal.y1.u3 var1, List<com.aspose.slides.internal.e1.w1> var2, boolean var3) {
      super(var1);
      if (var2 != null) {
         this.r4 = var2;
         this.c4 = false;
      }

      this.d2 = var3;
      var1.n5(this);
      if (var1.t2().containsKey("transparent-page-background")) {
         this.m1 = var1.t2().get_Item("transparent-page-background");
      }
   }

   @Override
   public com.aspose.slides.internal.y1.u3 h0() {
      return this.l6;
   }

   @Override
   public String c8() {
      return "application/X-fop-aps";
   }

   @Override
   public void n5(com.aspose.slides.internal.v0.h0 var1) {
      this.x8 = var1;
      com.aspose.slides.internal.f0.l6 var2 = new com.aspose.slides.internal.f0.l6(this.l6.a6().z3().n5());
      var2.n5(this.l6.n5());
      n3[] var3 = new n3[]{var2};
      this.l6.a6().z3().n5(this.t9(), var3);
   }

   @Override
   public void n5(t4 var1) {
      this.y2 = var1;
      super.n5(var1);
   }

   @Override
   public void t2() {
      for (int var1 = 0; var1 < this.r4.size(); var1++) {
         k5$l6 var2 = new k5$l6();
         var2.l6(this.r4.get_Item(var1));
         n5(var2.n5());
         this.r4.set_Item(var1, var2.n5());
      }

      if (this.d2) {
         l6 var7 = new l6(this.b3);
         y1 var10 = (!this.a0.u3() ? this.a0 : new y1(0.0F, 0.0F, this.r4.get_Item(0).l6(), this.r4.get_Item(0).k5())).y4();
         var7.n5(this.r4, var10.y4());
      }

      if (this.f2) {
         h0 var8 = new h0();
         List$Enumerator var11 = this.r4.iterator();

         try {
            while (var11.hasNext()) {
               com.aspose.slides.internal.e1.w1 var3 = (com.aspose.slides.internal.e1.w1)var11.next();
               var8.l6(var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
               var11.dispose();
            }
         }
      }

      this.z8 = true;
      int var9 = this.m3;
      if (var9 == 0) {
         new com.aspose.slides.internal.y1.l6("No page could be rendered");
      }
   }

   @Override
   public void l6(o5 var1) {
      if (this.a0.u3()) {
         com.aspose.slides.internal.a0.n3 var2 = var1.s7();
         if (var2 != null) {
            y1 var3 = var2.y2().m3().y4();
            this.a0 = new y1(var3.x8() / 1000.0F, var3.n3() / 1000.0F, var3.s7() / 1000.0F, var3.k5() / 1000.0F);
         }
      }

      f2 var14 = new f2(var1.l6().s7() / 1000.0F, var1.l6().k5() / 1000.0F);
      com.aspose.slides.internal.e1.w1 var15 = new com.aspose.slides.internal.e1.w1(var14.l6(), var14.k5());
      this.r4.addItem(var15);
      if (this.r4.size() == 1) {
         z3 var4 = new z3();
         var4.n5((Object)Integer.valueOf(0));
         var4.k5("root");
         this.d5.push(var4);
      }

      this.y1.clear();
      this.n5(new k5$n5());
      super.l6(var1);
      k5$n5 var16 = new k5$n5();
      var16.n5(com.aspose.slides.internal.h2.m3.n5(com.aspose.slides.internal.h2.z8.n5(9, "AUTO")));
      if (this.s3.size() > 0) {
         this.f2 = true;
         this.s3.sort(new k5$k5(null));
         List$Enumerator var5 = this.s3.iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.j8.u3 var6 = (com.aspose.slides.internal.j8.u3)var5.next();
               com.aspose.slides.internal.j8.n5 var7 = var6.n5();
               com.aspose.slides.internal.j8.a6 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.j8.a6.class);
               if (var8 != null) {
                  r4 var9 = new r4(new s7(com.aspose.slides.internal.p1s.n5.r6));
                  var9.n5(new m1(var6.l6().y4(), var8.a6(), var8.u3()));
                  c4 var10 = new c4();
                  var10.l6(var6.l6().y4());
                  var10.n5(true);
                  var9.n5(var10);
                  var16.n5(var9);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         this.s3.clear();
         if (var16.t2() > 0) {
            var15.n5(var16);
         }
      }

      this.m3++;
   }

   private static void n5(com.aspose.slides.internal.e1.w1 var0) {
      if (var0 != null) {
         List var1 = new List();

         for (int var2 = 0; var2 < var0.t2(); var2++) {
            var1.addItem(new k5$a6(var0.n5(var2), var2));
         }

         var1.sort(new k5$u3());
         var0.c8();
         List$Enumerator var7 = var1.iterator();

         try {
            while (var7.hasNext()) {
               k5$a6 var3 = (k5$a6)var7.next();
               var0.n5(var3.l6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }
   }

   @Override
   protected void l6() {
      this.n5(new k5$n5());
   }

   @Override
   protected void k5() {
      this.m1();
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.m1 var1) {
      this.t4().u3().n5(com.aspose.slides.internal.j7.c8.n5(var1));
   }

   public static com.aspose.slides.internal.x4g.m1 n5(e2 var0) {
      if (null == var0) {
         throw new NullReferenceException("Matrix must not be null");
      }

      double[] var1 = var0.n5();
      return new com.aspose.slides.internal.x4g.m1(
         (float)var1[0], (float)var1[1], (float)var1[2], (float)var1[3], (float)var1[4] / 1000.0F, (float)var1[5] / 1000.0F
      );
   }

   @Override
   protected void n5(e2 var1, y1 var2) {
      this.l6();
      if (!var2.u3()) {
         this.n5(var2.x8() / 1000.0F, var2.n3() / 1000.0F, var2.s7() / 1000.0F, var2.k5() / 1000.0F);
      }

      this.t4().u3().n5(com.aspose.slides.internal.j7.c8.n5(n5(var1)));
   }

   @Override
   protected void n3() {
      this.k5();
   }

   @Override
   protected List<Object> n5() {
      return new List<>();
   }

   @Override
   protected void n5(List<Object> var1) {
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.c8 var1, boolean var2) {
      if (var2) {
         this.t4().n5(var1.o8());
      } else {
         this.t4().l6(var1.o8());
      }
   }

   @Override
   protected void a6() {
      if (this.j5 == null) {
         throw new InvalidOperationException("No current path available!");
      }

      this.t4().n5(this.j5);
      this.j5 = null;
   }

   @Override
   protected void u9() {
      if (this.j5.t2() != 0 && ((c4)this.j5.n5(this.j5.t2() - 1)).t2() != 0) {
         ((c4)this.j5.n5(this.j5.t2() - 1)).n5(true);
      }
   }

   @Override
   protected void n5(float var1, float var2) {
      if (this.j5 == null) {
         this.j5 = new r4();
         this.n5(this.j5);
      }

      this.w1 = new w1(var1, var2);
      if (this.j5.t2() != 0 && ((c4)this.j5.n5(this.j5.t2() - 1)).t2() != 0) {
         c4 var3 = new c4();
         this.n5(var3);
         this.j5.n5(var3);
      }
   }

   @Override
   protected void l6(float var1, float var2) {
      if (this.j5 == null) {
         this.j5 = new r4();
         this.n5(this.j5);
      }

      w1 var3 = this.w1.u3();
      this.w1 = new w1(var1, var2);
      if (this.j5.t2() == 0) {
         c4 var4 = new c4();
         this.n5(var4);
         this.j5.n5(new c4());
         y2 var5 = new y2(var3.u3(), this.w1.u3());
         this.n5(var5);
         ((c4)this.j5.n5(this.j5.t2() - 1)).n5(var5);
      } else {
         c4 var6 = (c4)this.j5.n5(this.j5.t2() - 1);
         y2 var7 = com.aspose.slides.internal.v6g.k5.n5(var6.n5(var6.t2() - 1), y2.class);
         var7.n5().addItem(this.w1.u3());
      }
   }

   @Override
   protected void n5(float var1, float var2, float var3, float var4) {
      c4 var5 = new c4();
      this.n5(var5);
      r4 var6 = new r4();
      this.n5(var6);
      var5.l6(new y1(var1, var2, var3, var4));
      var5.n5(true);
      var6.n5(var5);
      this.t4().n5(var6);
   }

   @Override
   protected void n5(
      float var1,
      float var2,
      float var3,
      float var4,
      com.aspose.slides.internal.v8.n5 var5,
      com.aspose.slides.internal.v8.n5 var6,
      com.aspose.slides.internal.v8.n5 var7,
      com.aspose.slides.internal.v8.n5 var8
   ) {
      if (this.t4() != null) {
         this.n5(
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            var7,
            var8,
            com.aspose.slides.internal.o9b.c8.l6(this.t4().l6(), com.aspose.slides.internal.o9b.c8.u3)
               ? new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.t6j.k5.n5(this.t4().l6().o8()))
               : null
         );
      }
   }

   @Override
   protected void n5(
      float var1,
      float var2,
      float var3,
      float var4,
      com.aspose.slides.internal.v8.n5 var5,
      com.aspose.slides.internal.v8.n5 var6,
      com.aspose.slides.internal.v8.n5 var7,
      com.aspose.slides.internal.v8.n5 var8,
      com.aspose.slides.internal.w0.l6 var9
   ) {
      if (this.t4() != null) {
         if (var5 != null && var5.a6 != null && var6 != null && var6.a6 != null && var7 != null && var7.a6 != null && var8 != null && var8.a6 != null) {
            r4 var15 = new r4();
            if (com.aspose.slides.internal.o9b.c8.l6(this.t4().k5(), com.aspose.slides.internal.o9b.c8.u3)) {
               var15.n5(new s7(com.aspose.slides.internal.t6j.k5.n5(this.t4().k5().o8())));
            }

            if (var9 != null) {
               var15.n5(var9);
            }

            y1 var16 = new y1(var1, var2, var3, var4);
            c4 var12 = new c4();
            c4 var13 = com.aspose.slides.internal.e9.n5.n5(var16.y4(), new w1(var5.a6.n5, var5.a6.l6), new w1(var5.a6.k5, var5.a6.u3));

            for (int var14 = 0; var14 < var13.t2(); var14++) {
               var12.n5(var13.n5(var14));
            }

            var13 = com.aspose.slides.internal.e9.n5.l6(var16.y4(), new w1(var8.a6.k5, var8.a6.u3), new w1(var8.a6.a6, var8.a6.u9));

            for (int var20 = 0; var20 < var13.t2(); var20++) {
               var12.n5(var13.n5(var20));
            }

            var13 = com.aspose.slides.internal.e9.n5.k5(var16.y4(), new w1(var6.a6.a6, var6.a6.u9), new w1(var6.a6.h0, var6.a6.c8));

            for (int var21 = 0; var21 < var13.t2(); var21++) {
               var12.n5(var13.n5(var21));
            }

            var13 = com.aspose.slides.internal.e9.n5.u3(var16.y4(), new w1(var7.a6.h0, var7.a6.c8), new w1(var7.a6.n5, var7.a6.l6));

            for (int var22 = 0; var22 < var13.t2(); var22++) {
               var12.n5(var13.n5(var22));
            }

            var12.n5(true);
            var15.n5(var12);
            var15.k5(1);
            this.t4().n5(var15);
         } else {
            r4 var10 = new r4();
            this.n5(var10);
            if (com.aspose.slides.internal.o9b.c8.l6(this.t4().k5(), com.aspose.slides.internal.o9b.c8.u3)) {
               var10.n5(new s7(com.aspose.slides.internal.t6j.k5.n5(this.t4().k5().o8())));
            }

            if (var9 != null) {
               var10.n5(var9);
            }

            c4 var11 = new c4();
            this.n5(var11);
            var11.l6(new y1(var1, var2, var3, var4));
            var11.n5(true);
            var10.n5(var11);
            var10.k5(0);
            this.t4().n5(var10);
         }
      }
   }

   @Override
   protected void n5(
      com.aspose.slides.internal.v8.n5 var1,
      com.aspose.slides.internal.v8.n5 var2,
      com.aspose.slides.internal.v8.n5 var3,
      com.aspose.slides.internal.v8.n5 var4
   ) {
      if (var1 != null && var1.a6 != null) {
         this.i1 = var1.a6;
      } else if (var2 != null && var2.a6 != null) {
         this.i1 = var2.a6;
      } else if (var3 != null && var3.a6 != null) {
         this.i1 = var3.a6;
      } else if (var4 != null && var4.a6 != null) {
         this.i1 = var4.a6;
      }
   }

   private static void n5(r4 var0, w1[] var1) {
      r4 var2 = new r4();
      c4 var3 = new c4();
      var3.l6(var1);
      var3.n5(true);
      var2.n5(var3);
      var0.n5(var2);
   }

   @Override
   protected void n5(y1 var1) {
      y1 var2 = var1.y4();
      if (this.i1 != null) {
         if (this.e5[0] != null) {
            float var3 = this.e5[0][0].l6() / 2.0F;
            var1.u3(var1.n3() + var3);
            var1.n5(var1.k5() - var3);
            var2.u3(var2.n3() - var3);
            var2.n5(var2.k5() + var3);
         }

         if (this.e5[1] != null) {
            float var6 = this.e5[1][0].l6() / 2.0F;
            var1.l6(var1.s7() - var6);
            var2.l6(var2.s7() + var6);
         }

         if (this.e5[2] != null) {
            float var7 = this.e5[2][0].l6() / 2.0F;
            var1.n5(var1.k5() - var7);
            var2.n5(var2.k5() + var7);
         }

         if (this.e5[3] != null) {
            float var8 = this.e5[3][0].l6() / 2.0F;
            var1.k5(var1.x8() + var8);
            var1.l6(var1.s7() - var8);
            var2.k5(var2.x8() - var8);
            var2.l6(var2.s7() + var8);
         }

         w1 var9 = new w1(var1.x8() + var1.k5() / 2.0F, var1.n3() + var1.k5() / 2.0F);
         w1 var4 = new w1(var1.h0() - var1.k5() / 2.0F, var1.n3() + var1.k5() / 2.0F);
         if (this.e5[0] != null) {
            r4 var5 = new r4(this.e5[0][0]);
            var5.n5(com.aspose.slides.internal.e9.n5.n5(var1.y4(), new w1(this.i1.n5, this.i1.l6), new w1(this.i1.k5, this.i1.u3)));
            n5(var5, new w1[]{var9, new w1(var2.a6(), var2.t2()), new w1(var2.h0(), var2.t2()), var4});
            this.t4().n5(var5);
         }

         if (this.e5[1] != null) {
            r4 var10 = new r4(this.e5[1][0]);
            var10.n5(com.aspose.slides.internal.e9.n5.l6(var1.y4(), new w1(this.i1.k5, this.i1.u3), new w1(this.i1.a6, this.i1.u9)));
            n5(var10, new w1[]{var4, new w1(var2.h0(), var2.t2()), new w1(var2.h0(), var2.l6())});
            this.t4().n5(var10);
         }

         if (this.e5[2] != null) {
            r4 var11 = new r4(this.e5[2][0]);
            var11.n5(com.aspose.slides.internal.e9.n5.k5(var1.y4(), new w1(this.i1.a6, this.i1.u9), new w1(this.i1.h0, this.i1.c8)));
            n5(var11, new w1[]{var4, new w1(var2.h0(), var2.l6()), new w1(var2.a6(), var2.l6()), var9});
            this.t4().n5(var11);
         }

         if (this.e5[3] != null) {
            r4 var12 = new r4(this.e5[3][0]);
            var12.n5(com.aspose.slides.internal.e9.n5.u3(var1.y4(), new w1(this.i1.h0, this.i1.c8), new w1(this.i1.n5, this.i1.l6)));
            n5(var12, new w1[]{var9, new w1(var2.a6(), var2.l6()), new w1(var2.a6(), var2.t2())});
            this.t4().n5(var12);
         }

         this.e5 = new s7[4][];
         this.i1 = null;
      }
   }

   @Override
   protected void n5(float var1, float var2, float var3, float var4, boolean var5, boolean var6, int var7, com.aspose.slides.internal.o9b.c8 var8, int var9) {
      s7[] var10 = this.n5(com.aspose.slides.internal.o9b.y1.n5(var1, var2, var3, var4).y4(), var5, var6, var7, var8.o8());
      if (this.i1 != null) {
         this.e5[var9] = var10;
      }
   }

   public static int n5(int var0) {
      switch (var0) {
         case 2:
            return 2;
         default:
            return 0;
      }
   }

   private void n5(r4 var1, s7 var2, w1 var3, w1 var4) {
      var1.n5(var2);
      c4 var5 = new c4();
      this.n5(var5);
      var5.l6(var3.u3(), var4.u3());
      var1.n5(var5);
   }

   private static s7 n5(com.aspose.slides.internal.o9b.c8 var0, float var1, int var2, int var3, float var4, float[] var5) {
      s7 var6 = new s7(com.aspose.slides.internal.t6j.k5.n5(var0.o8()));
      var6.n5(var1);
      var6.l6(var2);
      var6.k5(var2);
      var6.u3(var3);
      var6.l6(var4);
      if (var5 != null) {
         var6.n5(var5);
         var6.a6(n5(var2));
      }

      return var6;
   }

   public final s7[] n5(y1 var1, boolean var2, boolean var3, int var4, com.aspose.slides.internal.o9b.c8 var5) {
      float var6 = var1.x8();
      float var7 = var1.n3();
      float var8 = var6 + var1.s7();
      float var9 = var7 + var1.k5();
      float var10 = var1.s7();
      float var11 = var1.k5();
      s7[] var12 = new s7[0];
      if (!(var10 < 0.0F) && !(var11 < 0.0F)) {
         r4 var13 = new r4();
         this.n5(var13);
         switch (var4) {
            case 31:
               if (var2) {
                  float var31 = q1.n5(2.0F * var11);
                  int var40 = com.aspose.slides.internal.v6g.k5.u3(var10 / var31, 13);
                  if (var40 % 2 == 0) {
                     var40++;
                  }

                  var31 = var10 / var40;
                  float var47 = var7 + var11 / 2.0F;
                  var12 = new s7[]{n5(var5.o8(), var11, 0, 0, 10.0F, new float[]{3.0F, 2.0F})};
                  if (this.i1 == null) {
                     this.n5(var13, var12[0], new w1(var6, var47), new w1(var8, var47));
                  }
               } else {
                  float var33 = q1.n5(2.0F * var10);
                  int var41 = com.aspose.slides.internal.v6g.k5.u3(var11 / var33, 13);
                  if (var41 % 2 == 0) {
                     var41++;
                  }

                  var33 = var11 / var41;
                  float var48 = var6 + var10 / 2.0F;
                  var12 = new s7[]{n5(var5.o8(), var10, 0, 0, 10.0F, new float[]{3.0F, 2.0F})};
                  if (this.i1 == null) {
                     this.n5(var13, var12[0], new w1(var48, var7), new w1(var48, var9));
                  }
               }
               break;
            case 36:
               if (var2) {
                  float var27 = q1.n5(2.0F * var11);
                  int var38 = com.aspose.slides.internal.v6g.k5.u3(var10 / var27, 13);
                  if (var38 % 2 == 0) {
                     var38++;
                  }

                  var27 = var10 / var38;
                  float var45 = var7 + var11 / 2.0F;
                  var12 = new s7[]{n5(var5.o8(), var11, 2, 0, 10.0F, new float[]{0.0F, 2.0F})};
                  if (this.i1 == null) {
                     this.n5(var13, var12[0], new w1(var6, var45), new w1(var8, var45));
                  }
               } else {
                  float var29 = q1.n5(2.0F * var10);
                  int var39 = com.aspose.slides.internal.v6g.k5.u3(var11 / var29, 13);
                  if (var39 % 2 == 0) {
                     var39++;
                  }

                  var29 = var11 / var39;
                  float var46 = var6 + var10 / 2.0F;
                  var12 = new s7[]{n5(var5.o8(), var10, 2, 0, 10.0F, new float[]{0.0F, 2.0F})};
                  if (this.i1 == null) {
                     this.n5(var13, var12[0], new w1(var46, var7), new w1(var46, var9));
                  }
               }
               break;
            case 37:
               if (var2) {
                  float var25 = var11 / 3.0F;
                  float var36 = var7 + var25 / 2.0F;
                  float var43 = var36 + var25 + var25;
                  s7[] var50 = new s7[]{n5(var5.o8(), var25, 1, 0, 10.0F, null)};
                  this.n5(var13, var50[0], new w1(var6, var36), new w1(var8, var36));
                  this.n5(var13, var50[0], new w1(var6, var43), new w1(var8, var43));
               } else {
                  float var26 = var10 / 3.0F;
                  float var37 = var6 + var26 / 2.0F;
                  float var44 = var37 + var26 + var26;
                  s7[] var51 = new s7[]{n5(var5.o8(), var26, 1, 0, 10.0F, null)};
                  this.n5(var13, var51[0], new w1(var37, var7), new w1(var37, var9));
                  this.n5(var13, var51[0], new w1(var44, var7), new w1(var44, var9));
               }
               break;
            case 55:
            case 119:
               float var52 = var4 == 55 ? 0.4F : -0.4F;
               if (var2) {
                  com.aspose.slides.internal.o9b.c8 var23 = com.aspose.slides.internal.v3.k5.n5(var5.o8(), -var52).o8();
                  com.aspose.slides.internal.o9b.c8 var15 = com.aspose.slides.internal.v3.k5.n5(var5.o8(), var52).o8();
                  float var16 = var11 / 3.0F;
                  float var17 = var7 + var16 / 2.0F;
                  s7[] var19 = new s7[]{
                     n5(var23.o8(), var16, 1, 0, 10.0F, null), n5(var5.o8(), var16, 1, 0, 10.0F, null), n5(var15.o8(), var16, 1, 0, 10.0F, null)
                  };
                  this.n5(var13, var19[0], new w1(var6, var17), new w1(var8, var17));
                  this.n5(var13, var19[1], new w1(var6, var17 + var16), new w1(var8, var17 + var16));
                  this.n5(var13, var19[2], new w1(var6, var17 + var16 + var16), new w1(var8, var17 + var16 + var16));
               } else {
                  com.aspose.slides.internal.o9b.c8 var24 = com.aspose.slides.internal.v3.k5.n5(var5.o8(), -var52).o8();
                  com.aspose.slides.internal.o9b.c8 var35 = com.aspose.slides.internal.v3.k5.n5(var5.o8(), var52).o8();
                  float var42 = var10 / 3.0F;
                  float var49 = var6 + var42 / 2.0F;
                  s7[] var53 = new s7[]{
                     n5(var24.o8(), var42, 1, 0, 10.0F, null), n5(var5.o8(), var42, 1, 0, 10.0F, null), n5(var35.o8(), var42, 1, 0, 10.0F, null)
                  };
                  this.n5(var13, var53[0], new w1(var49, var7), new w1(var49, var9));
                  this.n5(var13, var53[1], new w1(var49 + var42, var7), new w1(var49 + var42, var9));
                  this.n5(var13, var53[2], new w1(var49 + var42 + var42, var7), new w1(var49 + var42 + var42, var9));
               }
            case 57:
               break;
            case 67:
            case 101:
               float var18 = var4 == 101 ? 0.4F : -0.4F;
               if (var2) {
                  com.aspose.slides.internal.v3.k5.n5(var5.o8(), (var3 ? 1 : -1) * var18).n5(var5);
                  float var21 = var7 + var11 / 2.0F;
                  var12 = new s7[]{n5(var5.o8(), var11, 1, 0, 10.0F, null)};
                  if (this.i1 == null) {
                     this.n5(var13, var12[0], new w1(var6, var21), new w1(var8, var21));
                  }
               } else {
                  com.aspose.slides.internal.v3.k5.n5(var5.o8(), (var3 ? 1 : -1) * var18).n5(var5);
                  float var22 = var6 + var10 / 2.0F;
                  var12 = new s7[]{n5(var5.o8(), var10, 1, 0, 10.0F, null)};
                  if (this.i1 == null) {
                     this.n5(var13, var12[0], new w1(var22, var7), new w1(var22, var9));
                  }
               }
               break;
            default:
               if (var2) {
                  float var14 = var7 + var11 / 2.0F;
                  var12 = new s7[]{n5(var5.o8(), var11, 1, 0, 10.0F, null)};
                  if (this.i1 == null) {
                     this.n5(var13, var12[0], new w1(var6, var14), new w1(var8, var14));
                  }
               } else {
                  float var20 = var6 + var10 / 2.0F;
                  var12 = new s7[]{n5(var5.o8(), var10, 1, 0, 10.0F, null)};
                  if (this.i1 == null) {
                     this.n5(var13, var12[0], new w1(var20, var7), new w1(var20, var9));
                  }
               }
         }

         this.t4().n5(var13);
         return var12;
      } else {
         return var12;
      }
   }

   @Override
   protected void n5(t9 var1) {
      int var2 = this.u3;
      if (k5(var1)) {
         this.n5((com.aspose.slides.internal.d2.c8)var1);
         int var3 = this.u3 + var1.n3();
         int var4 = this.k5.n5() + var1.w1() + var1.m3();
         com.aspose.slides.internal.v0.u3 var5 = this.n5((com.aspose.slides.internal.a0.l6)var1);
         this.l6();
         c8 var6 = new c8();
         var6.l6(var3 / 1000.0F, var4 / 1000.0F);
         this.n5(var1, var6, var5);
         this.k5();
         com.aspose.slides.internal.v0.t4 var7 = this.x8.l6().get_Item(var5.h0());
         int var8 = var1.c8(4);
         this.n5(var7, var8, var1, var4, var3);
      }

      this.u3 = var2 + var1.f_();
   }

   private static boolean k5(com.aspose.slides.internal.a0.l6 var0) {
      while (var0.z1() == 0) {
         var0 = var0.t4();
         if (var0 == null) {
            return true;
         }
      }

      return var0.z1() != 57;
   }

   protected final void n5(m3 var1) {
      if (this.d5.size() > 0) {
         z3 var2 = com.aspose.slides.internal.v6g.k5.n5(this.d5.peek(), z3.class);
         if (var2 != null) {
            var2.n5((Object)Integer.valueOf(com.aspose.slides.internal.v6g.k5.u3(var2.n5(), int.class) + 1));
            if (this.k7.size() > 0) {
               var1.k5(this.k7.peek());
            }
         }
      }
   }

   protected void n5(com.aspose.slides.internal.p1s.l6 var1, com.aspose.slides.internal.o9b.c8 var2, w1 var3, String var4, c8 var5) {
      z1 var6 = new z1(
         var1, com.aspose.slides.internal.t6j.k5.n5(var2.o8()), com.aspose.slides.internal.t6j.k5.n5(var2.o8()), var3.u3(), var4, var1.l6(var4).a6(), 0.0F
      );
      var6.n5(var5);
      this.t4().n5(var6);
      this.n5(var6);
   }

   public final void n5(t9 var1, c8 var2, com.aspose.slides.internal.v0.u3 var3) {
      com.aspose.slides.internal.o9b.c8 var4 = com.aspose.slides.internal.v6g.k5.u3(var1.a6(7), com.aspose.slides.internal.o9b.c8.class).o8();
      com.aspose.slides.internal.p1s.l6 var5 = var3.k5();
      com.aspose.slides.ms.System.c4 var6 = com.aspose.slides.internal.v6g.k5.s7(0, 9).l6();
      com.aspose.slides.internal.r4.u3 var7 = new com.aspose.slides.internal.r4.u3<>(var1.d_());

      while (var7.l6()) {
         com.aspose.slides.internal.d2.c8 var8 = (com.aspose.slides.internal.d2.c8)var7.k5();
         if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.d2.t4.class)) {
            com.aspose.slides.internal.d2.t4 var28 = (com.aspose.slides.internal.d2.t4)var8;
            String var29 = var28.m1();
            int[] var30 = var28.k7();
            float var31 = 0.0F;
            if (var30 != null || var1.k7() != 0 || var1.m1() != 0) {
               int[] var13 = n5(var29, var3, var1, var30);
               float var14 = 0.0F;

               for (int var15 = 0; var15 < var13.length; var15++) {
                  var14 += var13[var15] / 1000.0F;
               }
            }

            if (var3.s7() == 131) {
               float var32 = var5.n5().n5((float)var5.n5().z8(), (float)var5.c8());
               float var37 = var5.n5().n5((float)var5.n5().j5(), (float)var5.c8());
               double var16 = com.aspose.slides.internal.v6g.k5.t2(var6, 15);

               for (int var39 = 0; var39 < var29.length(); var39++) {
                  char var19 = var29.charAt(var39);
                  float var20 = var3.l6(var19);
                  if (com.aspose.slides.ms.System.t9.c8(var19)) {
                     var19 = com.aspose.slides.ms.System.t9.z3(var19);
                     float var21 = var3.l6(var19);
                     c8 var22 = var2.k5();
                     var22.n5(var20 / var21, var37 / var32);
                     double var23 = var21 / var20;
                     var23 *= var16 * 1000.0;
                     var23 = com.aspose.slides.internal.v6g.k5.u3(var23, 14);
                     var23 /= 1000.0;
                     this.n5(var5, var4.o8(), new w1((float)var23, 0.0F), d1.n5(var19, 1), var22);
                  } else {
                     this.n5(var5, var4.o8(), new w1((float)var16, 0.0F), d1.n5(var19, 1), var2);
                  }

                  var16 += var20 / 1000.0F;
               }
            } else if (var1.k7() != 0) {
               double var25 = com.aspose.slides.internal.v6g.k5.t2(var6, 15);
               var31 += var1.k7() * var29.length() / 1000.0F;

               for (int var38 = 0; var38 < var29.length(); var38++) {
                  char var27 = var29.charAt(var38);
                  float var18 = var3.l6(var27);
                  this.n5(var5, var4.o8(), new w1((float)var25, 0.0F), d1.n5(var27, 1), var2);
                  var25 += (var18 + var1.k7()) / 1000.0F;
               }
            } else {
               this.n5(var5, var4.o8(), new w1(com.aspose.slides.internal.v6g.k5.c8(var6, 15), 0.0F), var29, var2);
            }

            float var33 = var5.l6(var29).l6() + var31;
            var33 *= 1000.0F;
            var33 = com.aspose.slides.internal.v6g.k5.u3(var33, 13);
            var33 /= 1000.0F;
            com.aspose.slides.ms.System.c4.k5(var6, com.aspose.slides.internal.v6g.k5.s7(var33, 13)).k7(var6);
         } else {
            if (!com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.d2.e2.class)) {
               throw new InvalidOperationException("Unsupported child element: " + var8);
            }

            com.aspose.slides.internal.d2.e2 var9 = (com.aspose.slides.internal.d2.e2)var8;
            String var10 = var9.m1();
            char var11 = var10.charAt(0);
            int var12 = var9.k7() ? var1.m1() + var1.k7() : 0;
            this.n5(var5, var4.o8(), new w1(com.aspose.slides.internal.v6g.k5.c8(var6, 15), 0.0F), var10, var2);
            com.aspose.slides.ms.System.c4.k5(var6, com.aspose.slides.internal.v6g.k5.s7((var3.l6(var11) + var12) / 1000.0F, 13)).k7(var6);
         }
      }
   }

   private static int[] n5(String var0, com.aspose.slides.internal.v0.u3 var1, t9 var2, int[] var3) {
      int var4 = var0.length();
      int[] var5 = new int[var4];

      for (int var6 = 0; var6 < var4; var6++) {
         int var7 = var0.charAt(var6);
         if (com.aspose.slides.ms.System.t9.a6(var0.charAt(var6))) {
            var7 = com.aspose.slides.ms.System.t9.n5(var0.charAt(var6), var0.charAt(var6 + 1));
            var6++;
         }

         int var8 = var1.l6(var7);
         int var9;
         if (com.aspose.slides.internal.v3.l6.u9(var8)) {
            var9 = var2.m1();
         } else {
            var9 = 0;
         }

         int var10 = var1.n5(var8);
         int var11 = var3 != null && var6 < var4 - 1 ? var3[var6 + 1] : 0;
         int var12 = var6 < var4 - 1 ? var2.k7() : 0;
         var5[var6] = var10 + var11 + var12 + var9;
      }

      return var5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.d2.n3 var1) {
      this.n5((com.aspose.slides.internal.d2.c8)var1);
      float var2 = var1.m1() / 1000.0F;
      float var3 = (this.u3 + var1.n3()) / 1000.0F;
      float var4 = (this.k5.n5() + var1.w1() + var2 / 2.0F) / 1000.0F;
      float var5 = (this.u3 + var1.n3() + var1.l6()) / 1000.0F;
      com.aspose.slides.internal.o9b.c8 var6 = com.aspose.slides.internal.v6g.k5.u3(var1.a6(7), com.aspose.slides.internal.o9b.c8.class).o8();
      w1 var7 = new w1(var3, var4);
      w1 var8 = new w1(var5, var4);
      r4 var9 = new r4();
      s7 var10 = n5(var6.o8(), var2, 1, 0, 10.0F, null);
      this.n5(var9, var10, var7.u3(), var8.u3());
      this.t4().n5(var9);
      super.n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.d2.h0 var1, y1 var2) {
      y1 var3 = new y1((this.u3 + var2.x8()) / 1000.0F, (this.k5.n5() + var2.n3()) / 1000.0F, var2.s7() / 1000.0F, var2.k5() / 1000.0F);
      String var4 = this.l6(var1);
      if (var4.length() > 0) {
         this.n5(var4, var3.y4());
      }

      try {
         String var5 = var1.m1();
         this.n5(var5, var2.y4(), false);
         this.n5((com.aspose.slides.internal.a0.l6)var1, this.l6(var3.y4()).y4());
      } finally {
         if (var4.length() > 0) {
            this.z1();
         }
      }
   }

   @Override
   protected void n5(String var1, y1 var2, IGenericDictionary<com.aspose.slides.internal.o0.l6, String> var3, boolean var4) {
      var1 = com.aspose.slides.internal.f2.s7.n5(var1);
      com.aspose.slides.internal.r4.s7 var5 = this.h0().a6().h0();
      com.aspose.slides.internal.r4.t2 var6 = null;

      try {
         x8 var7 = this.h0().n3();
         var6 = var5.n5(var1, var7);
         if (var6 == null) {
            return;
         }

         com.aspose.slides.internal.o9b.t4 var8 = var5.n5(var6, var7);
         com.aspose.slides.internal.z0k.e2 var9 = new com.aspose.slides.internal.z0k.e2();
         var8.n5(var9, var8.x8());
         this.l6();
         if (this.s7 != 0 && var2.n3() < 0.0F) {
            var2.u3(var2.n3() + this.s7);
         }

         k7 var10 = new k7(
            new w1((this.u3 + var2.x8()) / 1000.0F, (this.k5.n5() + var2.n3()) / 1000.0F), new f2(var2.s7() / 1000.0F, var2.k5() / 1000.0F), var9.toArray()
         );
         this.b3.addItem(var10, true);
         com.aspose.slides.internal.e1.t2 var11 = new com.aspose.slides.internal.e1.t2();
         var11.n5(var10);
         this.t4().n5(var11);
         this.n5(var10);
         this.k5();
      } catch (IOException var12) {
         com.aspose.slides.ms.System.t4.n5().l6("Error: Image loading");
      }
   }

   @Override
   protected com.aspose.slides.internal.z6.k7 n5(int var1, int var2, int var3, int var4, Dictionary<com.aspose.slides.internal.o0.l6, String> var5) {
      return super.n5(var1, var2, var3, var4, var5);
   }

   @Override
   protected void u3() {
   }

   @Override
   public void n5(com.aspose.slides.internal.d2.u9 var1, y1 var2) {
      this.u3();
      com.aspose.slides.internal.e5.c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.c8, com.aspose.slides.internal.e5.c4.class);
      if (var3 != null) {
         int var4 = this.u3;
         int var5 = this.k5.n5();
         c8 var6 = new c8();
         var6.l6(var4 / 1000.0F, var5 / 1000.0F);
         k5$n5 var7 = new k5$n5();
         var7.n5(var6);
         var7.n5(this.h0);

         for (int var8 = 0; var8 < var3.u3.t2(); var8++) {
            var7.n5(var3.u3.n5(var8));
         }

         this.t4().n5(var7);
      }
   }

   protected final y1 l6(y1 var1) {
      com.aspose.slides.internal.e1.t2 var2 = this.t4();
      List var3 = new List();

      do {
         if (var2.u3() != null) {
            var3.addItem(var2.u3());
         }

         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.y2(), com.aspose.slides.internal.e1.t2.class);
      } while (var2 != null);

      c8 var4 = new c8();
      var3.reverse();
      List$Enumerator var5 = var3.iterator();

      try {
         while (var5.hasNext()) {
            c8 var6 = (c8)var5.next();
            var4.n5(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4.n5(var1.y4());
   }

   protected final void n5(com.aspose.slides.internal.a0.l6 var1, y1 var2) {
      com.aspose.slides.internal.j8.n5 var3 = null;
      boolean var4 = false;
      s3$k5 var5 = (s3$k5)var1.a6(1);
      if (var5 != null) {
         var4 = true;
         String var6 = var5.n5();
         String var7 = var5.l6();
         boolean var8 = var6 != null && var6.length() > 0;
         boolean var9 = var7 != null && var7.length() > 0;
         if (var8 && var9) {
         }
      }

      if (!var4) {
         s3$l6 var11 = (s3$l6)var1.a6(2);
         if (var11 != null) {
            String var13 = var11.n5();
            if (var13 != null && var13.length() > 0) {
               var4 = true;
               var3 = new com.aspose.slides.internal.j8.a6(var13, var11.l6());
               var3 = this.p8.l6(var3);
            }
         }
      }

      if (var4 && var3 != null) {
         com.aspose.slides.internal.c4.n5 var12 = (com.aspose.slides.internal.c4.n5)var1.a6(37);
         var3.n5(var12);
         com.aspose.slides.internal.j8.u3 var14 = new com.aspose.slides.internal.j8.u3(var3, var2.y4());
         this.s3.addItem(var14);
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.d2.s7 var1) {
      y1 var2 = new y1(this.u3 / 1000.0F, this.k5.n5() / 1000.0F + var1.w1() / 1000.0F, var1.l6() / 1000.0F, var1.e_() / 1000.0F);
      this.l6(var2.y4()).a6(var2);
      super.n5(var1);
      this.n5(var1, var2.y4());
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.f2.u3 q0() {
      return c8;
   }
}
