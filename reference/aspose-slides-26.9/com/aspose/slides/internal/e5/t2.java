package com.aspose.slides.internal.e5;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public abstract class t2 implements Cloneable {
   public t2 n5;
   public t2$l6 l6;
   public com.aspose.slides.internal.w2.u9 k5;

   protected t2(t2 var1) {
      this.n5 = var1;
   }

   public t2 n5(t2 var1, boolean var2) {
      t2 var3 = (t2)this.clone();
      var3.n5 = var1;
      var3.l6 = null;
      return var3;
   }

   @Override
   protected Object clone() {
      return this.z8();
   }

   public void n5(w1 var1) {
   }

   public final void n5(com.aspose.slides.internal.w2.u9 var1) {
      if (var1 != null) {
         this.k5 = new com.aspose.slides.internal.w2.h0(var1);
      }
   }

   public final com.aspose.slides.internal.w2.u9 m_() {
      return this.k5;
   }

   public c8 n_() {
      return this.n5.n_();
   }

   public y4 o_() {
      return this.n5.o_();
   }

   protected boolean p_() {
      return this.o_().u3();
   }

   public final com.aspose.slides.internal.y1.u3 q_() {
      return this.n_().b_();
   }

   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, w1 var4) {
   }

   public w1 n5(w1 var1, c8 var2) {
      return null;
   }

   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
   }

   public static void n5(t2 var0, com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      var0.n5(var1, var2, var3);
   }

   /** @deprecated */
   protected final void n5(char[] var1, int var2, int var3, w1 var4, com.aspose.slides.internal.w2.u9 var5) {
   }

   public void l6(char[] var1, int var2, int var3, w1 var4, com.aspose.slides.internal.w2.u9 var5) {
      this.n5(var1, var2, var2 + var3, var4, var5);
   }

   public void u9() {
   }

   public void c8() {
      this.r_();
   }

   public void n5(t2 var1) {
   }

   public void l6(t2 var1) {
   }

   public void r_() {
   }

   public final t2 s_() {
      return this.n5;
   }

   public t2$n5 x8() {
      return null;
   }

   public t2$n5 k5(t2 var1) {
      return null;
   }

   public k5 n3() {
      return new m3('\u0000');
   }

   public static String a_(String var0) {
      if (d1.a6(var0, "http://www.w3.org/1999/XSL/Format")) {
         return "fo";
      } else if (d1.a6(var0, "http://xmlgraphics.apache.org/fop/extensions")) {
         return "fox";
      } else if (d1.a6(var0, "http://xmlgraphics.apache.org/fop/internal")) {
         return "foi";
      } else {
         return d1.a6(var0, "http://www.w3.org/2000/svg") ? "svg" : null;
      }
   }

   public static String n5(String var0, String var1) {
      String var2 = a_(var0);
      return var2 != null ? d1.n5(new String[]{var2, ":", var1}) : d1.n5(new String[]{"(Namespace URI: \"", var0, "\", ", "Local Name: \"", var1, "\")"});
   }

   public final q0 y4() {
      return e2.n5(this.q_().m1());
   }

   protected final void n5(com.aspose.slides.internal.w2.u9 var1, com.aspose.slides.internal.o0.l6 var2) {
      this.y4().n5(this, this.t9(), var2, var1);
   }

   protected final void n5(com.aspose.slides.internal.w2.u9 var1, String var2) {
      this.n5(var1, new com.aspose.slides.internal.o0.l6("http://www.w3.org/1999/XSL/Format", var2));
   }

   protected final void l6(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      this.n5(var1, var2, var3, false);
   }

   protected final void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3, boolean var4) {
      this.y4().n5(this, this.t9(), var2, var3, var4, var1);
   }

   protected final void k5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      this.n5(var1, this.t9(), var2, var3, null);
   }

   protected final void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3, String var4, String var5) {
      String var6 = a_(var3);
      com.aspose.slides.internal.o0.l6 var7;
      if (var6 != null) {
         var7 = new com.aspose.slides.internal.o0.l6(var3, var6, var4);
      } else {
         var7 = new com.aspose.slides.internal.o0.l6(var3, var4);
      }

      this.y4().n5(this, var2, var7, var5, var1);
   }

   protected final void l6(String var1) {
      this.y4().n5(this, this.t9(), var1, false, this.k5);
   }

   protected final void n5(String var1, boolean var2) {
      this.y4().n5(this, this.t9(), var1, var2, this.k5);
   }

   protected final void k5(String var1) {
      this.y4().n5(this, this.t9(), var1, this.k5);
   }

   public static String l6(com.aspose.slides.internal.w2.u9 var0) {
      return d1.n5(new String[]{"Error(", k5(var0), "): "});
   }

   public static String k5(com.aspose.slides.internal.w2.u9 var0) {
      return var0 == null ? "Unknown location" : d1.n5(new String[]{a3.l6(var0.n5()), "/", a3.l6(var0.l6())});
   }

   public com.aspose.slides.internal.t1.k7 e2() {
      return this.n5.e2();
   }

   public final String t9() {
      return this.u3(this.t4());
   }

   public final String u3(String var1) {
      if (var1 != null) {
         a5 var2 = new a5();
         var2.n5(var1).n5(':').n5(this.z1());
         return var2.toString();
      } else {
         return this.z1();
      }
   }

   public abstract String z1();

   public abstract String t4();

   public String q0() {
      return null;
   }

   public int z3() {
      return 0;
   }

   public final com.aspose.slides.internal.o0.n5 m1() {
      return null;
   }

   public com.aspose.slides.internal.v3.u9 k7() {
      return null;
   }

   protected static void n5(t2 var0, t2 var1) {
      if (var0.l6 == null) {
         var0.l6 = new t2$l6();
      }

      if (var1.l6 == null) {
         var1.l6 = new t2$l6();
      }

      var0.l6.n5 = var1;
      var1.l6.l6 = var0;
   }

   public boolean n5(int var1) {
      return true;
   }

   public final Stack<com.aspose.slides.internal.d5.u3> n5(Stack<com.aspose.slides.internal.d5.u3> var1) {
      if (this.j5()) {
         this.l6(var1);
      }

      com.aspose.slides.internal.d5.u3 var2;
      if (var1.size() > 0) {
         var2 = (com.aspose.slides.internal.d5.u3)var1.peek();
      } else {
         var2 = null;
      }

      var1 = this.n5(var1, var2);
      if (this.w1()) {
         this.l6(var1);
      }

      return var1;
   }

   protected Stack<com.aspose.slides.internal.d5.u3> n5(Stack<com.aspose.slides.internal.d5.u3> var1, com.aspose.slides.internal.d5.u3 var2) {
      t2$n5 var3 = this.x8();

      while (var3 != null && var3.l6()) {
         var1 = var3.k5().n5(var1);
      }

      return var1;
   }

   public boolean m3() {
      return false;
   }

   private com.aspose.slides.internal.d5.u3 l6(Stack<com.aspose.slides.internal.d5.u3> var1) {
      com.aspose.slides.internal.d5.u3 var2 = null;
      com.aspose.slides.internal.d5.u3 var3 = null;
      if (var1.size() == 0) {
         if (this.m3()) {
            var3 = new com.aspose.slides.internal.d5.u3(this);
         }
      } else {
         var2 = (com.aspose.slides.internal.d5.u3)var1.peek();
         if (var2 != null && (!var2.l6() || !l6(var2.n5(), this))) {
            var3 = new com.aspose.slides.internal.d5.u3(this);
         }
      }

      if (var3 != null) {
         var1.push(var3);
      } else {
         var3 = var2;
      }

      return var3;
   }

   private boolean j5() {
      return this.n5(13);
   }

   private boolean w1() {
      return this.n5(3);
   }

   private static boolean l6(t2 var0, t2 var1) {
      for (t2 var2 = var1; var2 != null; var2 = var2.s_()) {
         if (var2 == var0) {
            return true;
         }
      }

      return false;
   }

   public void n5(com.aspose.slides.internal.c4.n5 var1) {
      throw new NotSupportedException();
   }

   protected Object z8() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
