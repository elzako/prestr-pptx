package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.Stack;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Specialized.HybridDictionary;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.exceptions.XsltCompileException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.v7y.t3;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.Xml.b0;
import com.aspose.slides.ms.System.Xml.f4;
import com.aspose.slides.ms.System.Xml.k6;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.u4;

public class z1 {
   public com.aspose.slides.internal.l7h.a5 n5 = new com.aspose.slides.internal.l7h.a5();
   private int u9;
   private s3 h0;
   private o8 c8;
   private s0 t2;
   private k6 s7;
   private Hashtable x8;
   private Stack n3;
   private HybridDictionary y4 = new HybridDictionary();
   private z7 e2;
   private com.aspose.slides.internal.r5d.n5 t9;
   private p8 z1;
   public j8 l6;
   public j8 k5;
   private j9 t4;
   private List<j3> q0;
   private com.aspose.slides.internal.v7y.z6 z3 = new com.aspose.slides.internal.v7y.z6();
   private int m1 = 0;
   public boolean u3;
   public static k6 a6 = new k6("*", com.aspose.slides.ms.System.d1.n5);
   private Hashtable[] k7 = new Hashtable[]{new Hashtable(), new Hashtable(), new Hashtable()};
   private ArrayList m3 = new ArrayList();
   private static String[] z8 = new String[]{
      "System", "System.Collections", "System.Text", "System.Text.RegularExpressions", "System.Xml", "System.Xml.Xsl", "System.Xml.XPath"
   };
   private static volatile int j5 = 0;

   public final com.aspose.slides.internal.r5d.n5 n5() {
      return this.t9;
   }

   public final int l6() {
      return this.u9;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public final z7 k5() {
      return this.e2;
   }

   public final z7 u3() {
      return this.e2;
   }

   public final boolean a6() {
      return this.k5().u9();
   }

   public final boolean u9() {
      return this.k5().h0();
   }

   public final boolean h0() {
      return this.k5().c8();
   }

   public final j8 c8() {
      return this.l6;
   }

   public final j9 t2() {
      return this.t4;
   }

   public final void n5(j9 var1) {
      this.t4 = var1;
      this.t2 = this.t4;
   }

   public final List<j3> s7() {
      return this.q0;
   }

   public final String x8() {
      this.m1++;
      return com.aspose.slides.ms.System.a3.n5(this.m1, com.aspose.slides.internal.x7n.l6.k5());
   }

   public final void n5(z7 var1, o8 var2, com.aspose.slides.internal.w1n.n5 var3) {
      Object var12 = null;
      this.c8 = var2;
      this.n5(var1);
      this.h0 = this.z1.a6();
      this.q0 = new List<>();

      try {
         this.k5 = new j8();
         this.n5(this.k5);

         try {
            this.z7();
         } catch (XsltCompileException var9) {
            throw var9;
         } catch (RuntimeException var10) {
            throw new XsltCompileException(var10, this.u3().z3(), this.u3().s7(), this.u3().x8());
         }

         this.l6.a6();
         this.t4.n5(this.k5);
         this.l6.u3();
         if (this.x8 != null) {
            this.l6.n5(this);
            this.t4.n5(this);
         }
      } finally {
         this.k7();
      }
   }

   public final boolean n3() {
      return this.z1.n5().u3();
   }

   public final void n5(boolean var1) {
      this.z1.n5().n5(var1);
   }

   public final boolean y4() {
      return this.z1.n5().a6();
   }

   public final void l6(boolean var1) {
      this.z1.n5().l6(var1);
   }

   public final void n5(String var1) {
      String[] var2 = this.q0(var1);
      if (var2 != null) {
         this.z1.n5(var2);
      }
   }

   public final void l6(String var1) {
      String[] var2 = this.q0(var1);
      if (var2 != null) {
         this.z1.l6(var2);
      }
   }

   public final void e2() {
      this.n5(this.u3().u3().n5(this.u3().k5().d5, this.u3().k5().y6));
   }

   public final void t9() {
      this.l6(this.u3().u3().n5(this.u3().k5().d2, this.u3().k5().y6));
   }

   public final boolean k5(String var1) {
      return this.z1.k5(var1);
   }

   public final boolean u3(String var1) {
      return this.z1.u3(var1);
   }

   public final void z1() {
      this.t4();
      String var1 = this.u3().u3().n5(this.n5().m8, this.n5().y6);
      if (var1.length() != 0) {
         this.n5(!"1.0".equals(var1));
      }
   }

   public final void t4() {
      this.z1.a6();
      z7 var1 = this.u3();
      if (var1.m3()) {
         do {
            this.z1.n5(var1.e2(), var1.t4());
         } while (var1.z8());

         var1.c8();
      }
   }

   public void q0() {
      this.t2.k5(this.z1.n5().u9());
      this.z1.u9();
   }

   public final p8 z3() {
      return this.z1.k5();
   }

   public final int n5(d1 var1) {
      s3 var2;
      if (var1.u9()) {
         var2 = this.h0;
      } else {
         var2 = this.z1.l6();
      }

      d1 var3 = var2.n5(var1.k5());
      if (var3 != null) {
         if (!var3.u9()) {
            throw XsltException.create("Variable or parameter '{0}' was duplicated within the same scope.", var1.u3());
         }

         if (var1.u9()) {
            if (var1.l6() == var3.l6()) {
               throw XsltException.create("Variable or parameter '{0}' was duplicated within the same scope.", var1.u3());
            }

            if (var1.l6() < var3.l6()) {
               var2.n5(var1);
               return var3.a6();
            }

            return -1;
         }
      }

      var2.n5(var1);
      return this.t2.u9();
   }

   public final void n5(String var1, o0 var2) {
      if (this.x8 == null) {
         this.x8 = new Hashtable();
      }

      o0 var3 = com.aspose.slides.internal.v6g.k5.n5(this.x8.get_Item(var1), o0.class);
      if (var3 == null || var2.k5 <= var3.k5) {
         this.x8.set_Item(var1, var2);
      }
   }

   public final boolean a6(String var1) {
      return this.x8 == null ? false : this.x8.contains(var1);
   }

   public final o0 u9(String var1) {
      return this.x8 != null ? (o0)this.x8.get_Item(var1) : null;
   }

   public final String h0(String var1) {
      return this.z1.l6(var1);
   }

   public final String m1() {
      return this.z1.h0();
   }

   public final void n5(k6 var1, int var2, int var3) {
      this.t4.n5(var1, var2, var3);
   }

   public final void n5(k6 var1, com.aspose.slides.internal.x7i.l6 var2) {
      this.t4.n5(var1, var2);
   }

   private String[] q0(String var1) {
      if (var1 != null && var1.length() != 0) {
         String[] var2 = f4.c4(var1);

         try {
            for (int var3 = 0; var3 < var2.length; var3++) {
               String var4 = var2[var3];
               var2[var3] = this.z1.n5("#default".equals(var4) ? com.aspose.slides.ms.System.d1.n5 : var4);
            }

            return var2;
         } catch (XsltException var5) {
            if (!this.n3()) {
               throw var5;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public final boolean c8(String var1) {
      if ("yes".equals(var1)) {
         return true;
      } else if ("no".equals(var1)) {
         return false;
      } else {
         throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", this.u3().e2(), var1);
      }
   }

   public final String t2(String var1) {
      z7 var2 = this.u3();
      String var3 = var2.e2();
      String var4 = null;
      if (var2.m1()) {
         do {
            String var5 = var2.t9();
            String var6 = var2.e2();
            if (var5.length() == 0) {
               if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var1)) {
                  var4 = var2.t4();
               } else if (!this.n3()) {
                  throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", var6, var3);
               }
            }
         } while (var2.k7());

         var2.c8();
      }

      if (var4 == null) {
         throw XsltException.create("Missing mandatory attribute '{0}'.", var1);
      } else {
         return var4;
      }
   }

   public final k6 s7(String var1) {
      String var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var2};
      String[] var5 = new String[]{var3};
      f0.n5(var1, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      return new k6(var3, this.z1.l6(var2));
   }

   public final k6 x8(String var1) {
      String var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var2};
      String[] var5 = new String[]{var3};
      f0.n5(var1, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      return new k6(var3, this.z1.n5(var2));
   }

   public static com.aspose.slides.internal.x6s.l6 n5(b0 var0) {
      var0.c8(1);
      var0.a6(true);

      try {
         return new com.aspose.slides.internal.x6s.l6(var0, 2);
      } finally {
         var0.w1();
      }
   }

   private void z3(String var1) {
      this.y4.addItem(var1, null);
   }

   private void m1(String var1) {
      this.y4.removeItem(var1);
   }

   public final boolean n3(String var1) {
      return this.y4.contains(var1);
   }

   public final r8 y4(String var1) {
      String var2 = this.u3().z3();
      r8 var3 = this.c8.n5(var2.length() != 0 ? this.c8.n5(null, var2) : null, var1);
      if (var3 == null) {
         throw XsltException.create("Cannot resolve the referenced document '{0}'.", var1);
      } else {
         return var3;
      }
   }

   public final z7 n5(r8 var1) {
      Object var2 = this.c8.n5(var1, null, null);
      String var3 = var1.toString();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.z0k.t4.class)) {
         b0 var4 = new b0(var3, (com.aspose.slides.internal.z0k.t4)var2);
         var4.n5(this.c8);
         return new z7(n5(var4).createNavigator(), var3, this.h0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.x6s.a6.class)) {
         return new z7((com.aspose.slides.internal.x6s.a6)var2, var3, this.h0);
      } else {
         throw XsltException.create("Cannot resolve the referenced document '{0}'.", var3);
      }
   }

   public final void n5(z7 var1) {
      String var2 = var1.l6();
      this.z3(var2);
      var1.n5(this.e2);
      this.e2 = var1;
      this.t9 = this.e2.k5();
      this.z1 = this.e2.a6();
   }

   public final void k7() {
      z7 var1 = this.e2;
      this.e2 = var1.n5();
      var1.n5(null);
      if (this.e2 != null) {
         this.t9 = this.e2.k5();
         this.z1 = this.e2.a6();
      } else {
         this.t9 = null;
         this.z1 = null;
      }

      this.m1(var1.l6());
      var1.t2();
   }

   public final void n5(j8 var1) {
      if (this.n3 == null) {
         this.n3 = new Stack();
      }

      this.n3.push(var1);
      this.l6 = var1;
   }

   public final j8 m3() {
      j8 var1 = (j8)this.n3.pop();
      this.l6 = (j8)this.n3.peek();
      return var1;
   }

   public final void n5(u9 var1) {
      this.l6.n5(var1);
   }

   public final void n5(w2 var1) {
      this.l6.n5(var1);
   }

   public final void l6(w2 var1) {
      this.t2 = var1;
      this.s7 = var1.u3();
      this.l6(var1.n5() != -1);
   }

   public final void z8() {
      this.t2 = this.t4;
   }

   public final k6 j5() {
      return this.s7;
   }

   public final int e2(String var1) {
      return this.n5(var1, true, true, false);
   }

   public final int n5(String var1, boolean var2, boolean var3, boolean var4) {
      t3 var5;
      try {
         var5 = new t3(var4 ? this.z3.l6(var1, var2, var3) : this.z3.n5(var1, var2, var3), var1, false);
      } catch (XPathException var7) {
         if (!this.n3()) {
            throw XsltException.create("'{0}' is an invalid XPath expression.", new String[]{var1}, var7);
         }

         var5 = new z1$n5(var1, this.u3().z3(), this.u3().s7(), this.u3().x8());
      }

      this.q0.addItem(new j3(var5, this.z1));
      return this.q0.size() - 1;
   }

   public final int t9(String var1) {
      String var2 = u4.n5().n5(var1) ? var1 : com.aspose.slides.ms.System.d1.n5(new String[]{"string(", var1, ")"});
      return this.e2(var2);
   }

   public final int z1(String var1) {
      String var2 = u4.n5().n5(var1) ? var1 : com.aspose.slides.ms.System.d1.n5(new String[]{"boolean(", var1, ")"});
      return this.e2(var2);
   }

   public final String n5(String[] var1) {
      if ("#default".equals(var1[0])) {
         var1[0] = com.aspose.slides.ms.System.d1.n5;
         return this.m1();
      } else if (!f0.l6(var1[0])) {
         throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", this.e2.e2(), var1[0]);
      } else {
         return this.h0(var1[0]);
      }
   }

   private static void n5(String var0, int[] var1, com.aspose.slides.internal.l7h.a5 var2) {
      int var3 = var0.length();
      int var4 = var1[0];

      while (true) {
         char var5;
         label30: {
            if (var4 < var3) {
               var5 = var0.charAt(var4);
               if (var5 != '{') {
                  if (var5 == '}') {
                     if (var4 + 1 >= var3 || var0.charAt(var4 + 1) != '}') {
                        throw XsltException.create("Right curly brace in the attribute value template '{0}' must be doubled.", var0);
                     }

                     var4++;
                  }
                  break label30;
               }

               if (var4 + 1 < var3 && var0.charAt(var4 + 1) == '{') {
                  var4++;
                  break label30;
               }
            }

            var1[0] = var4;
            return;
         }

         var2.n5(var5);
         var4++;
      }
   }

   private static void l6(String var0, int[] var1, com.aspose.slides.internal.l7h.a5 var2) {
      boolean var3 = false;
      boolean var4 = true;
      byte var5 = 2;
      int var6 = var0.length();
      byte var7 = 0;

      for (int var8 = var1[0] + 1; var8 < var6; var8++) {
         char var9 = var0.charAt(var8);
         switch (var7) {
            case 0:
               switch (var9) {
                  case '"':
                     var7 = 2;
                     continue;
                  case '\'':
                     var7 = 1;
                     continue;
                  case '{':
                     throw XsltException.create("AVT cannot be nested in AVT '{0}'.", var0);
                  case '}':
                     if (++var8 == var1[0] + 2) {
                        throw XsltException.create("XPath Expression in AVT cannot be empty: '{0}'.", var0);
                     }

                     var2.n5(var0, var1[0] + 1, var8 - var1[0] - 2);
                     var1[0] = var8;
                     return;
                  default:
                     continue;
               }
            case 1:
               if (var9 == '\'') {
                  var7 = 0;
               }
               break;
            case 2:
               if (var9 == '"') {
                  var7 = 0;
               }
         }
      }

      throw XsltException.create(
         var7 == 0 ? "The braces are not closed in AVT expression '{0}'." : "The literal in AVT expression is not correctly closed '{0}'.", var0
      );
   }

   private static boolean n5(String var0, int[] var1, com.aspose.slides.internal.l7h.a5 var2, boolean[] var3) {
      var3[0] = false;
      if (var1[0] == var0.length()) {
         return false;
      }

      var2.n5(0);
      n5(var0, var1, var2);
      if (var2.l6() == 0) {
         var3[0] = true;
         l6(var0, var1, var2);
      }

      return true;
   }

   public final ArrayList n5(String var1, boolean[] var2) {
      ArrayList var3 = new ArrayList();
      var2[0] = true;
      int[] var4 = new int[]{0};
      boolean[] var5 = new boolean[]{false};

      while (n5(var1, var4, this.n5, var5)) {
         String var6 = this.n5.toString();
         if (var5[0]) {
            var3.addItem(new c8(this.t9(var6)));
            var2[0] = false;
         } else {
            var3.addItem(new i9(var6));
         }
      }

      return var3;
   }

   public final ArrayList t4(String var1) {
      boolean var2 = false;
      boolean[] var3 = new boolean[]{false};
      ArrayList var4 = this.n5(var1, var3);
      var2 = var3[0];
      return var4;
   }

   public k5 w1() {
      k5 var1 = new k5();
      var1.l6(this);
      return var1;
   }

   public u3 r4() {
      u3 var1 = new u3();
      var1.l6(this);
      return var1;
   }

   public a6 c4() {
      a6 var1 = new a6();
      var1.l6(this);
      return var1;
   }

   public u9 y2() {
      u9 var1 = new u9();
      var1.l6(this);
      return var1;
   }

   public n3 y1() {
      n3 var1 = new n3();
      var1.l6(this);
      return var1;
   }

   public y4 a0() {
      y4 var1 = new y4();
      var1.l6(this);
      return var1;
   }

   public e2 d2() {
      e2 var1 = new e2();
      var1.l6(this);
      return var1;
   }

   public q0 d5() {
      q0 var1 = new q0();
      var1.l6(this);
      return var1;
   }

   public z8 s3() {
      z8 var1 = new z8();
      var1.l6(this);
      return var1;
   }

   public r4 p8() {
      r4 var1 = new r4();
      var1.l6(this);
      return var1;
   }

   public y1 f2() {
      y1 var1 = new y1();
      var1.l6(this);
      return var1;
   }

   public d5 l6(int var1) {
      d5 var2 = new d5(var1);
      var2.l6(this);
      return var2;
   }

   public i1 i1() {
      i1 var1 = new i1();
      var1.l6(this);
      return var1;
   }

   public u6 e5() {
      u6 var1 = new u6();
      var1.l6(this);
      return var1;
   }

   public t1 b3() {
      t1 var1 = new t1();
      var1.l6(this);
      return var1;
   }

   public a3 o0() {
      a3 var1 = new a3();
      var1.l6(this);
      return var1;
   }

   public void z7() {
      this.n5(new j9());
      this.t2().l6(this);
   }

   public e9 v4() {
      e9 var1 = new e9();
      var1.l6(this);
      return var1;
   }

   public w2 u6() {
      w2 var1 = new w2();
      var1.l6(this);
      return var1;
   }

   public w2 t1() {
      w2 var1 = new w2();
      var1.e2(this);
      return var1;
   }

   public j4 a5() {
      j4 var1 = new j4();
      var1.l6(this);
      return var1;
   }

   public n1 h2() {
      n1 var1 = new n1();
      var1.l6(this);
      return var1;
   }

   public p6 v0() {
      p6 var1 = new p6();
      var1.l6(this);
      return var1;
   }

   public d1 k5(int var1) {
      d1 var2 = new d1(var1);
      var2.l6(this);
      return var2.a6() != -1 ? var2 : null;
   }

   public s4 f0() {
      s4 var1 = new s4();
      var1.l6(this);
      return var1;
   }

   public t2 a3() {
      return new t2(this);
   }

   public i9 p3() {
      return new i9(this);
   }

   public final XsltException x9() {
      com.aspose.slides.internal.x6s.a6 var1 = this.u3().u3().n5();
      String var2 = var1.u9();
      var1.q0();
      String var3 = var1.u9();
      return XsltException.create("'{0}' cannot be a child of the '{1}' element.", var2, var3);
   }
}
