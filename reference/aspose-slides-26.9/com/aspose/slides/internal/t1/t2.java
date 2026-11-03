package com.aspose.slides.internal.t1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class t2 extends n5 implements com.aspose.slides.internal.v8.u3 {
   private String t2;
   private String s7;
   private String x8;
   private com.aspose.slides.internal.f2.u3 n3;
   private com.aspose.slides.internal.v8.y4 y4;
   private Dictionary<String, com.aspose.slides.internal.e5.t9> e2;
   private z8 t9;
   private s7 z1;
   private r4 t4;
   private a6 q0 = null;

   public t2(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.t2 = var1.a6(81).j_();
      this.s7 = var1.a6(134).j_();
      this.x8 = var1.a6(154).j_();
      this.n3 = var1.a6(197).u9();
      this.y4 = new com.aspose.slides.internal.v8.y4(
         com.aspose.slides.internal.v8.n3.n5(var1.a6(267).a6()), com.aspose.slides.internal.v8.s7.n5(var1.a6(255).a6())
      );
      if (d1.n5(this.x8)) {
         this.k5("master-reference");
      }
   }

   @Override
   public void u9() {
      super.u9();
      this.e2 = new Dictionary<>();
      this.t9 = this.e2().b3().a6(this.x8);
      if (this.t9 == null) {
         this.z1 = this.e2().b3().u9(this.x8);
         if (this.z1 == null) {
            this.y4().t2(this, this.t9(), this.x8, this.m_());
         }
      }

      this.n_().n5(this);
   }

   @Override
   public void c8() {
      if (this.q0 == null) {
         this.l6("(title?,static-content*,flow)");
      }

      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "title")) {
            if (this.t4 != null) {
               this.n5(var1, "fo:title");
            } else if (this.e2.size() != 0) {
               this.l6(var1, "fo:title", "fo:static-content");
            } else if (this.q0 != null) {
               this.l6(var1, "fo:title", "fo:flow");
            }
         } else if (d1.a6(var3, "static-content")) {
            if (this.q0 != null) {
               this.l6(var1, "fo:static-content", "fo:flow");
            }
         } else if (d1.a6(var3, "flow")) {
            if (this.q0 != null) {
               this.n5(var1, "fo:flow");
            }
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.t2 var1) {
      int var2 = var1.z3();
      switch (var2) {
         case 16:
            this.q0 = (a6)var1;
            this.n5(this.q0);
            break;
         case 70:
            this.n5((w1)var1);
            this.e2.addItem(((a6)var1).i1(), (a6)var1);
            break;
         case 80:
            this.t4 = (r4)var1;
            break;
         default:
            super.n5(var1);
      }
   }

   private void n5(a6 var1) {
      String var2 = var1.i1();
      if (this.u9(var2)) {
         this.y4().h0(this, var1.t9(), var2, var1.m_());
      }

      if (!this.e2().b3().h0(var2) && !d1.a6(var2, "xsl-before-float-separator") && !d1.a6(var2, "xsl-footnote-separator")) {
         this.y4().c8(this, var1.t9(), var2, var1.m_());
      }
   }

   public final w1 a6(String var1) {
      return this.e2.containsKey(var1) ? (w1)this.e2.get_Item(var1) : null;
   }

   public final r4 z7() {
      return this.t4;
   }

   @Override
   public final com.aspose.slides.internal.v8.s7 z6() {
      return this.y4.z6();
   }

   public final a6 v4() {
      return this.q0;
   }

   public final boolean u9(String var1) {
      return this.e2.containsKey(var1);
   }

   public final Dictionary<String, com.aspose.slides.internal.e5.t9> u6() {
      return this.e2;
   }

   public final z8 n5(int var1, boolean var2, boolean var3, boolean var4) {
      if (this.z1 == null) {
         return this.t9;
      }

      boolean var5 = var1 % 2 == 1;
      return this.z1.n5(var5, var2, var3, var4, this.v4().i1());
   }

   public final boolean t1() {
      return this.z1 == null || this.z1.b3();
   }

   public final boolean a5() {
      return this.z1 != null && this.z1.o0();
   }

   public final String h2() {
      return this.x8;
   }

   @Override
   public String z1() {
      return "page-sequence";
   }

   @Override
   public int z3() {
      return 53;
   }

   public final String v0() {
      return this.t2;
   }

   public final String f0() {
      return this.s7;
   }

   @Override
   public final com.aspose.slides.internal.v8.k5 j9() {
      return this.y4 != null ? this.y4.j9() : com.aspose.slides.internal.v8.k5.n5;
   }

   @Override
   public final com.aspose.slides.internal.v8.k5 e9() {
      return this.y4 != null ? this.y4.e9() : com.aspose.slides.internal.v8.k5.n5;
   }

   @Override
   protected Stack<com.aspose.slides.internal.d5.u3> n5(Stack<com.aspose.slides.internal.d5.u3> var1, com.aspose.slides.internal.d5.u3 var2) {
      Dictionary var3 = this.u6();
      if (var3 != null) {
         Dictionary$ValueCollection$Enumerator var4 = var3.getValues().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.e5.t2 var5 = (com.aspose.slides.internal.e5.t2)var4.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var5, w1.class)) {
                  var1 = ((w1)var5).n5(var1);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      a6 var9 = this.v4();
      if (var9 != null) {
         var1 = var9.n5(var1);
      }

      return var1;
   }

   public final void a3() {
      this.q0 = null;
      this.e2.clear();
   }
}
