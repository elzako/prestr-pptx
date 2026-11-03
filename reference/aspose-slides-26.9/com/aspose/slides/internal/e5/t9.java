package com.aspose.slides.internal.e5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.h2.h2;
import com.aspose.slides.ms.System.d1;

public abstract class t9 extends t2 {
   private static final h2[] u9 = com.aspose.slides.internal.e5.s7.n5();
   public t2 u3;
   protected t2 a6;
   private List<com.aspose.slides.internal.o0.n5> h0 = null;
   private Dictionary<com.aspose.slides.internal.o0.l6, String> c8 = null;
   private boolean t2 = false;
   private Dictionary<String, com.aspose.slides.internal.v4.j5> s7 = null;
   private int x8 = -1;
   private String n3 = null;

   public t9(t2 var1) {
      super(var1);
      if (var1 != null && com.aspose.slides.internal.v6g.k5.l6(var1, t9.class)) {
         if (((t9)var1).e5()) {
            this.t2 = true;
         } else {
            int var2 = this.z3();
            if (var2 == 15 || var2 == 24 || var2 == 25) {
               this.t2 = true;
            }
         }
      }
   }

   @Override
   public t2 n5(t2 var1, boolean var2) {
      t9 var3 = (t9)super.n5(var1, var2);
      if (var2) {
         var3.u3 = null;
      }

      return var3;
   }

   public static h2 l6(int var0) {
      return u9[var0];
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, w1 var4) {
      this.n5(var2);
      var4.n5(var3);
      if (!this.p_() || d1.a6(var1, "marker")) {
         this.n5(var4);
      }
   }

   @Override
   public w1 n5(w1 var1, c8 var2) {
      return this.o_().l6().n5(this, var1);
   }

   @Override
   public void n5(w1 var1) {
      this.n3 = var1.a6(122).j_();
   }

   @Override
   public void u9() {
      if (this.n3 != null) {
         this.a6(this.n3);
      }
   }

   private void a6(String var1) {
      if (!this.p_() && var1.length() != 0) {
         Dictionary var2 = this.o_().n5();
         if (!var2.containsKey(var1)) {
            var2.addItem(var1, var1);
         } else {
            this.y4().l6(this, this.t9(), var1, true, this.k5);
         }
      }
   }

   private boolean e5() {
      return this.t2;
   }

   @Override
   public void n5(t2 var1) {
      if (var1.z3() == 44) {
         this.n5((com.aspose.slides.internal.v4.j5)var1);
      } else {
         com.aspose.slides.internal.o0.n5 var2 = var1.m1();
         if (var2 != null) {
            this.n5(var2);
         } else if (this.u3 == null) {
            this.u3 = var1;
            this.a6 = var1;
         } else if (this.a6 == null) {
            t2 var3 = this.u3;

            while (var3.l6 != null && var3.l6.n5 != null) {
               var3 = var3.l6.n5;
            }

            com.aspose.slides.internal.e5.t2.n5(var3, var1);
         } else {
            com.aspose.slides.internal.e5.t2.n5(this.a6, var1);
            this.a6 = var1;
         }
      }
   }

   protected static void l6(t2 var0, t2 var1) {
      var1.n5(var0);
   }

   @Override
   public void l6(t2 var1) {
      t2 var2 = null;
      if (var1.l6 != null) {
         var2 = var1.l6.n5;
      }

      if (var1 == this.u3) {
         this.u3 = var2;
         if (this.u3 != null) {
            this.u3.l6.l6 = null;
         }
      } else {
         t2 var3 = var1.l6.l6;
         var3.l6.n5 = var2;
         if (var2 != null) {
            var2.l6.l6 = var3;
         }
      }

      if (var1 == this.a6) {
         if (var1.l6 != null) {
            this.a6 = var1.l6.l6;
         } else {
            this.a6 = null;
         }
      }
   }

   public final t9 l_() {
      t2 var1 = this.n5;

      while (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, t9.class)) {
         var1 = var1.n5;
      }

      return (t9)var1;
   }

   public boolean j5() {
      return false;
   }

   @Override
   public t2$n5 x8() {
      return this.w1() ? new t9$n5(this) : null;
   }

   public final boolean w1() {
      return this.u3 != null;
   }

   @Override
   public t2$n5 k5(t2 var1) {
      t2$n5 var2 = this.x8();
      if (var2 == null) {
         return null;
      }

      if (this.u3 == var1) {
         return var2;
      }

      while (var2.l6() && var2.c8().l6.n5 != var1) {
      }

      return var2.l6() ? var2 : null;
   }

   private void u3(t2 var1) {
   }

   protected final void n5(com.aspose.slides.internal.v4.j5 var1) {
      String var2 = var1.i1();
      if (this.u3 != null) {
         t2$n5 var3 = this.x8();

         while (var3.l6()) {
            t2 var4 = var3.k5();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, t9.class) || com.aspose.slides.internal.v6g.k5.l6(var4, x8.class) && ((x8)var4).w1()) {
               this.y4().u3(this, this.t9(), var2, this.k5);
               return;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var4, x8.class)) {
               var3.n5();
               this.u3(var4);
            }
         }
      }

      if (this.s7 == null) {
         this.s7 = new Dictionary<>();
      }

      if (!this.s7.containsKey(var2)) {
         this.s7.addItem(var2, var1);
      } else {
         this.y4().a6(this, this.t9(), var2, this.k5);
      }
   }

   public final boolean r4() {
      return this.s7 != null && this.s7.size() != 0;
   }

   public final Dictionary<String, com.aspose.slides.internal.v4.j5> c4() {
      return this.s7;
   }

   protected final boolean l6(String var1, String var2) {
      return d1.a6("http://www.w3.org/1999/XSL/Format", var1)
         && (
            d1.a6(var2, "block")
               || d1.a6(var2, "table")
               || d1.a6(var2, "table-and-caption")
               || d1.a6(var2, "block-container")
               || d1.a6(var2, "list-block")
               || d1.a6(var2, "float")
               || this.a6(var1, var2)
         );
   }

   protected final boolean k5(String var1, String var2) {
      return d1.a6("http://www.w3.org/1999/XSL/Format", var1)
         && (
            d1.a6(var2, "bidi-override")
               || d1.a6(var2, "character")
               || d1.a6(var2, "external-graphic")
               || d1.a6(var2, "instream-foreign-object")
               || d1.a6(var2, "inline")
               || d1.a6(var2, "inline-container")
               || d1.a6(var2, "leader")
               || d1.a6(var2, "page-number")
               || d1.a6(var2, "page-number-citation")
               || d1.a6(var2, "page-number-citation-last")
               || d1.a6(var2, "basic-link")
               || d1.a6(var2, "multi-toggle") && (this.z3() == 45 || this.k5(45) > 0)
               || d1.a6(var2, "footnote") && !this.t2
               || this.a6(var1, var2)
         );
   }

   protected final boolean u3(String var1, String var2) {
      return this.l6(var1, var2) || this.k5(var1, var2);
   }

   protected final boolean a6(String var1, String var2) {
      return d1.a6("http://www.w3.org/1999/XSL/Format", var1)
         && (
            d1.a6(var2, "multi-switch")
               || d1.a6(var2, "multi-properties")
               || d1.a6(var2, "wrapper")
               || !this.t2 && d1.a6(var2, "float")
               || d1.a6(var2, "retrieve-marker")
               || d1.a6(var2, "retrieve-table-marker")
         );
   }

   protected final int k5(int var1) {
      int var2 = 1;

      for (t2 var3 = this.s_(); var3 != null; var3 = var3.s_()) {
         if (var3.z3() == var1) {
            return var2;
         }

         var2++;
      }

      return -1;
   }

   public final void y2() {
      this.u3 = null;
   }

   public String y1() {
      return this.n3;
   }

   public final boolean a0() {
      return this.n3 != null && this.n3.length() > 0;
   }

   @Override
   public String q0() {
      return "http://www.w3.org/1999/XSL/Format";
   }

   @Override
   public String t4() {
      return "fo";
   }

   @Override
   public boolean m3() {
      String var1 = this.q0();
      String var2 = this.z1();
      return !this.a6(var1, var2) && this.l6(var1, var2);
   }

   public final void u3(int var1) {
      if (var1 >= 0 && (this.x8 < 0 || var1 < this.x8)) {
         this.x8 = var1;
         if (this.n5 != null) {
            t9 var2 = (t9)this.n5;
            int var3 = var2.d2();
            if (var3 < 0 || var1 < var3) {
               var2.u3(var1);
            }
         }
      }
   }

   public final int d2() {
      return this.x8;
   }

   public final int d5() {
      for (t2 var1 = this; var1 != null; var1 = var1.s_()) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, t9.class)) {
            int var2 = ((t9)var1).d2();
            if (var2 >= 0) {
               return var2;
            }
         }
      }

      return -1;
   }

   private void n5(com.aspose.slides.internal.o0.n5 var1) {
      if (var1 == null) {
         throw new NullReferenceException("Parameter attachment must not be null");
      }

      if (this.h0 == null) {
         this.h0 = new List<>();
      }

      this.h0.addItem(var1);
   }

   public final List<com.aspose.slides.internal.o0.n5> s3() {
      return this.h0 == null ? new List<>() : this.h0;
   }

   public final boolean p8() {
      return this.h0 != null;
   }

   public final void n5(com.aspose.slides.internal.o0.l6 var1, String var2) {
      if (var1 == null) {
         throw new NullReferenceException("Parameter attributeName must not be null");
      }

      if (this.c8 == null) {
         this.c8 = new Dictionary<>();
      }

      this.c8.addItem(var1, var2);
   }

   public final Dictionary<com.aspose.slides.internal.o0.l6, String> f2() {
      return this.c8 == null ? new Dictionary<>() : this.c8;
   }

   @Override
   public String toString() {
      return d1.n5(super.toString(), "[@id=", this.n3, "]");
   }
}
