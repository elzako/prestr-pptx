package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;

public class b0 extends c7 implements a3, f0 {
   private b0$k5 n5 = null;
   private u4 l6 = u4.n5().l6();
   private b0$h0 k5 = new b0$h0();
   private int u3;
   private int a6;
   private int u9;
   private b0$a6[] h0;
   private b0$a6 c8;
   private int t2 = 0;
   private int s7 = -1;
   private int x8;
   private int n3;
   private int y4;
   private boolean e2;
   private boolean t9;
   private b0$a6[] z1;
   private z9 t4;
   private boolean q0;
   private o8 z3;
   private String m1 = com.aspose.slides.ms.System.d1.n5;
   private boolean k7;
   private boolean m3 = true;
   private int z8;
   private int j5 = 2;
   private int w1;
   private boolean r4;
   private boolean c4;
   private boolean y2;
   private int y1;
   private int a0;
   private boolean d2;
   private long d5;
   private long s3;
   private boolean p8;
   private s2 f2;
   private String i1 = com.aspose.slides.ms.System.d1.n5;
   private b0$c8 e5;
   private b0$h0[] b3;
   private int o0 = -1;
   private String z7;
   private com.aspose.slides.internal.l7h.j5 v4;
   private z7 u6;
   private int t1 = 9;
   private b1 a5;
   private boolean h2;
   private p3 v0;
   private int f0;
   private y0 a3 = new y0();
   private int p3;
   private int x9;
   private int y0;
   private int j9;
   private boolean z6;
   private v0 e9;
   private b0$u9 o5;
   private boolean j8;
   private boolean w2;
   private com.aspose.slides.internal.l7h.a5 s0;
   private boolean v8;
   private boolean v3;
   private int g7 = 1;
   private int j4;
   private int i9 = 0;
   private o0 f5;
   private boolean j3;
   private int n1;
   private int p6;
   private long d1;
   private long s4;
   private Dictionary<o0, o0> h6;
   private boolean y8;
   private c7 c3;
   private boolean l4;
   private String i6;
   private String a7;
   private static final com.aspose.slides.internal.v6g.u9 r8 = new com.aspose.slides.internal.v6g.u9(
      "utf-16", "utf-16BE", "space", "lang", "preserve", "default"
   );

   public b0() {
      this.c8 = new b0$a6();
      this.u3 = 1;
   }

   public b0(z9 var1) {
      this.p8 = true;
      this.c3 = this;
      this.t4 = var1;
      var1.n5(com.aspose.slides.ms.System.d1.n5);
      if (!w4.k7()) {
         this.z3 = null;
      } else {
         this.z3 = new k1();
      }

      this.i6 = var1.n5("xml");
      this.a7 = var1.n5("xmlns");
      this.h0 = new b0$a6[8];
      this.h0[0] = new b0$a6();
      this.c8 = this.h0[0];
      this.s0 = new com.aspose.slides.internal.l7h.a5();
      this.e5 = new b0$c8();
      this.u3 = 4;
      this.a6 = 5;
      this.w1 = 2;
      this.z8 = 0;
      this.d2 = true;
      this.d5 = 0L;
      this.s3 = com.aspose.slides.internal.v6g.k5.u9(1.0E7, 14);
      this.d1 = 0L;
      this.s4 = 0L;
      this.k5.n3 = 1;
      this.k5.y4 = -1;
   }

   private b0(o8 var1, w4 var2, b1 var3) {
      this.p8 = false;
      this.c3 = this;
      this.e5 = new b0$c8();
      z9 var4 = var2.n5();
      if (var3 == null) {
         if (var4 == null) {
            var4 = new j9();
         } else {
            this.q0 = true;
         }

         this.t4 = var4;
         this.f2 = new s2(var4);
      } else {
         this.n5(var3, var2);
         var4 = this.t4;
      }

      var4.n5(com.aspose.slides.ms.System.d1.n5);
      this.i6 = var4.n5("xml");
      this.a7 = var4.n5("xmlns");
      this.z3 = var1;
      this.h0 = new b0$a6[8];
      this.h0[0] = new b0$a6();
      this.c8 = this.h0[0];
      this.s0 = new com.aspose.slides.internal.l7h.a5();
      this.w1 = 1;
      this.l4 = var2.l6();
      this.z8 = var2.x8() ? 1 : 0;
      this.k7 = true;
      this.r4 = var2.n3();
      this.c4 = var2.y4();
      this.y2 = var2.c8();
      this.y1 = var2.a6();
      this.a0 = var2.u9();
      this.k5.n3 = this.y1 + 1;
      this.k5.y4 = -this.a0 - 1;
      this.c8.n5(this.k5.l6() - 1, this.k5.k5() - 1);
      this.j5 = var2.e2();
      this.d5 = var2.t2();
      this.s3 = var2.s7();
      this.d1 = 0L;
      this.s4 = 0L;
      this.a5 = var3;
      this.u3 = 4;
      this.a6 = 5;
      switch (var2.h0()) {
         case 0:
            this.t1 = 0;
            this.h2 = true;
            break;
         case 1:
            this.t1 = 1;
            this.h2 = true;
            break;
         case 2:
            this.t1 = 9;
            break;
         default:
            this.t1 = 9;
      }
   }

   public b0(com.aspose.slides.internal.z0k.t4 var1) {
      this(com.aspose.slides.ms.System.d1.n5, var1, new j9());
   }

   public b0(com.aspose.slides.internal.z0k.t4 var1, z9 var2) {
      this(com.aspose.slides.ms.System.d1.n5, var1, var2);
   }

   public b0(String var1, com.aspose.slides.internal.z0k.t4 var2) {
      this(var1, var2, new j9());
   }

   public b0(String var1, com.aspose.slides.internal.z0k.t4 var2, z9 var3) {
      this(var3);
      this.f2 = new s2(var3);
      if (var1 != null && var1.length() != 0) {
         this.n5(var1, var2, null);
      } else {
         this.n5(var2, null);
      }

      this.z7 = this.k5.e2;
      this.v4 = this.k5.u3;
   }

   public b0(com.aspose.slides.internal.z0k.y1 var1) {
      this(com.aspose.slides.ms.System.d1.n5, var1, new j9());
   }

   public b0(com.aspose.slides.internal.z0k.y1 var1, z9 var2) {
      this(com.aspose.slides.ms.System.d1.n5, var1, var2);
   }

   public b0(String var1, com.aspose.slides.internal.z0k.y1 var2) {
      this(var1, var2, new j9());
   }

   public b0(String var1, com.aspose.slides.internal.z0k.y1 var2, z9 var3) {
      this(var3);
      this.f2 = new s2(var3);
      this.z7 = var1 != null ? var1 : com.aspose.slides.ms.System.d1.n5;
      this.n5(this.z7, var2);
      this.v4 = this.k5.u3;
   }

   public b0(String var1, int var2, b1 var3) {
      this(null != var3 && null != var3.n5() ? var3.n5() : new j9());
      if (var1 == null) {
         var1 = com.aspose.slides.ms.System.d1.n5;
      }

      if (var3 == null) {
         this.n5(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.internal.l7h.j5.z1(), var1);
      } else {
         this.z7 = var3.u9();
         this.n5(var3.u9(), com.aspose.slides.internal.l7h.j5.z1(), var1);
      }

      this.n5(var2, var3, false);
      this.v4 = this.k5.u3;
   }

   public b0(String var1, b1 var2) {
      this(null != var2 && null != var2.n5() ? var2.n5() : new j9());
      this.n5(
         var2 == null ? com.aspose.slides.ms.System.d1.n5 : var2.u9(),
         com.aspose.slides.internal.l7h.j5.z1(),
         com.aspose.slides.ms.System.d1.n5(new String[]{"<?xml ", var1, "?>"})
      );
      this.n5(17, var2, true);
   }

   public b0(String var1, z9 var2) {
      this(var2);
      if (var1 == null) {
         throw new ArgumentNullException("url");
      }

      if (var1.length() == 0) {
         throw new ArgumentException(com.aspose.slides.ms.System.Xml.v3.n5("The URL cannot be empty."), "url");
      }

      this.f2 = new s2(var2);
      this.m1 = var1;
      this.k5.t9 = this.c3().n5(null, var1);
      this.k5.e2 = this.k5.t9.toString();
      this.z7 = this.k5.e2;
      this.u3 = 2;
   }

   public b0(String var1, w4 var2, b1 var3, o8 var4) {
      this(var2.k5(), var2, var3);
      com.aspose.slides.ms.System.r8 var5 = var4.n5(null, var1);
      String var6 = var5.toString();
      if (var3 != null && var3.u9() != null && var3.u9().length() > 0 && !this.n5(var5, var6, var3.u9(), var2.k5())) {
         if (var6.length() > 0) {
            this.c8(
               "BaseUri must be specified either as an argument of XmlReader.Create or on the XmlParserContext. If it is specified on both, it must be the same base URI."
            );
         }

         var6 = var3.u9();
      }

      this.z7 = var6;
      this.d2 = true;
      this.n5 = new b0$k5(null);
      this.n5.a6 = var1;
      this.n5.u3 = var5;
      this.n5.h0 = var3;
      this.n5.u9 = var4;
      this.n5.t2 = 0;
      this.p6();
   }

   private void p6() {
      com.aspose.slides.internal.z0k.t4 var1 = null;
      var1 = (com.aspose.slides.internal.z0k.t4)this.n5
         .u9
         .n5(this.n5.u3, com.aspose.slides.ms.System.d1.n5, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class));
      if (var1 == null) {
         throw new XmlException("Cannot resolve '{0}'.", this.n5.a6);
      }

      com.aspose.slides.internal.l7h.j5 var2 = null;
      if (this.n5.h0 != null) {
         var2 = this.n5.h0.s7();
      }

      try {
         this.n5(this.n5.u3, this.z7, var1, null, 0, var2);
         this.v4 = this.k5.u3;
         if (this.n5.h0 != null && this.n5.h0.x8()) {
            this.n5(this.n5.h0);
         }
      } catch (RuntimeException var4) {
         var1.close();
         throw var4;
      }

      this.n5 = null;
   }

   public b0(com.aspose.slides.internal.z0k.t4 var1, byte[] var2, int var3, w4 var4, com.aspose.slides.ms.System.r8 var5, String var6, b1 var7, boolean var8) {
      this(var4.k5(), var4, var7);
      if (var7 != null && var7.u9() != null && var7.u9().length() > 0 && !this.n5(var5, var6, var7.u9(), var4.k5())) {
         if (var6.length() > 0) {
            this.c8(
               "BaseUri must be specified either as an argument of XmlReader.Create or on the XmlParserContext. If it is specified on both, it must be the same base URI."
            );
         }

         var6 = var7.u9();
      }

      this.z7 = var6;
      this.d2 = var8;
      this.n5 = new b0$k5(null);
      this.n5.n5 = var1;
      this.n5.l6 = var2;
      this.n5.k5 = var3;
      this.n5.u3 = var5;
      this.n5.h0 = var7;
      this.n5.t2 = 1;
      this.d1();
   }

   private void d1() {
      com.aspose.slides.internal.l7h.j5 var1 = null;
      if (this.n5.h0 != null) {
         var1 = this.n5.h0.s7();
      }

      this.n5(this.n5.u3, this.z7, this.n5.n5, this.n5.l6, this.n5.k5, var1);
      this.v4 = this.k5.u3;
      if (this.n5.h0 != null && this.n5.h0.x8()) {
         this.n5(this.n5.h0);
      }

      this.n5 = null;
   }

   public b0(com.aspose.slides.internal.z0k.y1 var1, w4 var2, String var3, b1 var4) {
      this(var2.k5(), var2, var4);
      if (var4 != null && var4.u9() != null) {
         var3 = var4.u9();
      }

      this.z7 = var3;
      this.d2 = var2.t9();
      this.n5 = new b0$k5(null);
      this.n5.c8 = var1;
      this.n5.h0 = var4;
      this.n5.t2 = 2;
      this.s4();
   }

   private void s4() {
      this.n5(this.z7, this.n5.c8);
      this.v4 = this.k5.u3;
      if (this.n5.h0 != null && this.n5.h0.x8()) {
         this.n5(this.n5.h0);
      }

      this.n5 = null;
   }

   @Override
   public w4 n5() {
      w4 var1 = new w4();
      if (this.q0) {
         var1.n5(this.t4);
      }

      switch (this.t1) {
         case 0:
            var1.k5(0);
            break;
         case 1:
            var1.k5(1);
            break;
         case 9:
            var1.k5(2);
            break;
         default:
            var1.k5(0);
      }

      var1.l6(this.y2);
      var1.n5(this.y1);
      var1.l6(this.a0);
      var1.k5(this.z8 == 1);
      var1.u3(this.r4);
      var1.a6(this.c4);
      var1.u3(this.j5);
      var1.n5(this.d5);
      var1.l6(this.s3);
      if (!w4.k7()) {
         var1.n5(this.z3);
      }

      var1.h0(true);
      return var1;
   }

   @Override
   public int s7() {
      return this.c8.n5;
   }

   @Override
   public String x8() {
      return this.c8.n5(this.t4);
   }

   @Override
   public String n3() {
      return this.c8.l6;
   }

   @Override
   public String y4() {
      return this.c8.u3;
   }

   @Override
   public String e2() {
      return this.c8.k5;
   }

   @Override
   public String z1() {
      if (this.u3 >= 21) {
         if (this.u3 == 21) {
            this.a8();
            this.u3 = this.a6;
         } else {
            this.f4();
         }
      }

      return this.c8.h0();
   }

   @Override
   public int t4() {
      return this.c8.t2;
   }

   @Override
   public String q0() {
      return this.z7;
   }

   @Override
   public boolean m1() {
      return this.c8.u3();
   }

   @Override
   public boolean l6() {
      return this.c8.a6();
   }

   @Override
   public char d5() {
      return this.c8.n5 == 2 ? this.c8.c8 : '"';
   }

   @Override
   public int k7() {
      return this.e5.n5;
   }

   @Override
   public int h0() {
      return this.i9;
   }

   @Override
   public boolean j5() {
      return this.u3 == 11;
   }

   @Override
   public z9 y1() {
      return this.t4;
   }

   @Override
   public boolean z3() {
      return true;
   }

   @Override
   public int z8() {
      return this.x8;
   }

   @Override
   public String u3(String var1) {
      int var2;
      if (com.aspose.slides.ms.System.d1.u3(var1, ':') == -1) {
         var2 = this.n3(var1);
      } else {
         var2 = this.y4(var1);
      }

      return var2 >= 0 ? this.h0[var2].h0() : null;
   }

   @Override
   public String k5(int var1) {
      if (var1 >= 0 && var1 < this.x8) {
         return this.h0[this.t2 + var1 + 1].h0();
      } else {
         throw new ArgumentOutOfRangeException("i");
      }
   }

   @Override
   public boolean k5(String var1) {
      int var2;
      if (com.aspose.slides.ms.System.d1.u3(var1, ':') == -1) {
         var2 = this.n3(var1);
      } else {
         var2 = this.y4(var1);
      }

      if (var2 >= 0) {
         if (this.i6()) {
            this.a7();
         }

         this.s7 = var2 - this.t2 - 1;
         this.c8 = this.h0[var2];
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l6(int var1) {
      if (var1 >= 0 && var1 < this.x8) {
         if (this.i6()) {
            this.a7();
         }

         this.s7 = var1;
         this.c8 = this.h0[this.t2 + 1 + this.s7];
      } else {
         throw new ArgumentOutOfRangeException("i");
      }
   }

   @Override
   public boolean k5() {
      if (this.x8 == 0) {
         return false;
      }

      if (this.i6()) {
         this.a7();
      }

      this.s7 = 0;
      this.c8 = this.h0[this.t2 + 1];
      return true;
   }

   @Override
   public boolean u3() {
      if (this.s7 + 1 < this.x8) {
         if (this.i6()) {
            this.a7();
         }

         this.c8 = this.h0[this.t2 + 1 + ++this.s7];
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a6() {
      if (this.i6()) {
         this.a7();
      } else if (this.c8.n5 != 2) {
         return false;
      }

      this.s7 = -1;
      this.c8 = this.h0[this.t2];
      return true;
   }

   private void h6() {
      switch (this.n5.t2) {
         case 0:
            this.p6();
            break;
         case 1:
            this.d1();
            break;
         case 2:
            this.s4();
      }
   }

   @Override
   public boolean u9() {
      if (this.n5 != null) {
         this.h6();
      }

      while (true) {
         switch (this.u3) {
            case 0:
               return this.q1();
            case 1:
               this.t2("Root element is missing.");
               return false;
            case 2:
               this.r1();
               this.i9 = 1;
               this.u3 = this.a6;
               if (this.h0(false)) {
                  this.v4 = this.k5.u3;
                  return true;
               }

               this.v4 = this.k5.u3;
               break;
            case 3:
               this.i9 = 1;
               this.u3 = this.a6;
               break;
            case 4:
               this.i9 = 1;
               this.u3 = this.a6;
               if (this.h0(false)) {
                  this.v4 = this.k5.u3;
                  return true;
               }

               this.v4 = this.k5.u3;
               break;
            case 5:
               return this.w5();
            case 6:
               this.r5();
               this.t2++;
               this.c8 = this.n5(this.t2, this.t2);
               this.u3 = 0;
               break;
            case 7:
               this.b9();
               this.u3 = this.a6;
               break;
            case 8:
               this.c8 = this.h0[this.t2];
               this.c8.n5(false);
               this.r5();
               this.b9();
               this.u3 = this.a6;
               break;
            case 9:
               this.r5();
               this.c8 = this.h0[this.t2];
               this.u3 = this.t2 == 0 ? 5 : 0;
               break;
            case 10:
            case 11:
            case 12:
               return false;
            case 13:
               this.u3 = this.a6;
               this.q2();
               return true;
            case 14:
               this.e0();
               return true;
            case 15:
               return this.i2();
            case 16:
               this.d6();
               this.u3 = this.a6;
               return true;
            case 17:
               this.c8 = this.n5(this.t2, this.t2);
               this.v4 = this.k5.u3;
               this.z7 = this.k5.e2;
               this.u3 = this.a6;
               break;
            case 18:
               this.c8 = this.n5(this.t2, this.t2);
               this.c8.n5(3, com.aspose.slides.ms.System.d1.n5);
               this.c8.n5(this.k5.n3, this.k5.k5());
               this.v4 = this.k5.u3;
               this.z7 = this.k5.e2;
               this.u3 = this.a6;
               return true;
            case 19:
               this.z0();
               this.u3 = 20;
               return true;
            case 20:
               this.r6();
               return false;
            case 21:
               this.y9();
               break;
            case 22:
               this.a7();
               this.c8 = this.h0[this.t2];
               break;
            case 23:
               this.a1();
               break;
            case 24:
               this.w3();
               break;
            case 25:
               this.i4();
         }
      }
   }

   @Override
   public void w1() {
      this.u3(this.d2);
   }

   @Override
   public void r4() {
      if (this.i9 == 1) {
         if (this.i6()) {
            this.a7();
            this.c8 = this.h0[this.t2];
         } else {
            switch (this.u3) {
               case 14:
                  this.e0();
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
               case 20:
               case 22:
               default:
                  break;
               case 21:
                  this.y9();
                  break;
               case 23:
                  this.a1();
                  break;
               case 24:
                  this.w3();
                  break;
               case 25:
                  this.i4();
            }
         }

         switch (this.c8.n5) {
            case 1:
               if (!this.c8.u3()) {
                  int var2 = this.t2;
                  this.j4 = 2;

                  while (this.c3.u9() && this.t2 > var2) {
                  }

                  this.j4 = 0;
               }
               break;
            case 2:
               this.c3.a6();
               if (!this.c8.u3()) {
                  int var1 = this.t2;
                  this.j4 = 2;

                  while (this.c3.u9() && this.t2 > var1) {
                  }

                  this.j4 = 0;
               }
         }

         this.c3.u9();
      }
   }

   @Override
   public String n5(String var1) {
      return !this.m3 ? null : this.f2.n5(var1);
   }

   @Override
   public boolean c8() {
      if (this.u3 != 22) {
         if (this.c8.n5 != 2) {
            return false;
         }

         if (this.i9 == 1 && this.s7 >= 0) {
            if (this.u3 == 23) {
               this.a1();
            }

            if (this.u3 == 24) {
               this.w3();
            }

            if (this.c8.n3 != null && this.w1 != 1) {
               this.c8 = this.c8.n3;
               this.n5(this.t2 + this.x8 + 1, this.t2 + 2);
               this.h0[this.t2 + this.x8 + 1] = this.c8;
               this.t9 = true;
            } else {
               b0$a6 var1 = this.n5(this.t2 + this.x8 + 1, this.c8.t2 + 1);
               var1.n5(3, this.c8.h0());
               this.c8.h0.n5(var1.u9);
               var1.t2 = this.c8.t2 + 1;
               this.c8 = var1;
               var1.n3 = null;
            }

            this.a6 = this.u3;
            this.u3 = 22;
            this.j9 = this.k5.z3;
            return true;
         } else {
            return false;
         }
      } else if (this.k5.z3 == this.j9) {
         if (this.c8.n3 != null) {
            this.c8 = this.c8.n3;
            this.h0[this.t2 + this.x8 + 1] = this.c8;
            return true;
         } else {
            return false;
         }
      } else {
         return this.x7();
      }
   }

   @Override
   public void a0() {
      if (this.c8.n5 != 5) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.Xml.v3.n5("Operation is not valid due to the current state of the object."));
      }

      if (this.u3 != 22 && this.u3 != 15) {
         switch (this.n5(this.c8.l6, false, true, this.c8.k5())) {
            case 3:
            case 7:
               this.a6 = this.u3;
               if (this.k5.k5 - this.k5.l6 == 0 && !this.k5.q0.l6()) {
                  this.u3 = 18;
               } else {
                  this.u3 = 17;
               }
               break;
            case 4:
            case 6:
            default:
               throw new XmlException("An internal error has occurred.", com.aspose.slides.ms.System.d1.n5);
            case 5:
               this.a6 = this.u3;
               this.u3 = 18;
         }
      } else {
         switch (this.n5(this.c8.l6, true, true, this.c8.k5())) {
            case 3:
            case 7:
               if (this.k5.k5 - this.k5.l6 == 0) {
                  this.z6 = true;
               }
               break;
            case 4:
            case 6:
            default:
               throw new XmlException("An internal error has occurred.", com.aspose.slides.ms.System.d1.n5);
            case 5:
               this.z6 = true;
         }
      }

      this.k5.k7 = true;
      this.t2++;
   }

   public final void l6(c7 var1) {
      this.c3 = var1;
   }

   public final void t2() {
      if (this.c3.s7() == 5 && this.u3 == 17 && !this.c3.u9()) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.Xml.v3.n5("Operation is not valid due to the current state of the object."));
      }
   }

   @Override
   public String c4() {
      this.t2();
      return super.c4();
   }

   @Override
   public boolean s3() {
      return true;
   }

   @Override
   public int n5(char[] var1, int var2, int var3) {
      if (!a6(this.c8.n5)) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.Xml.v3.n5("The ReadValueAsChunk method is not supported on node type {0}.", this.c8.n5)
         );
      }

      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (var1.length - var2 < var3) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (this.u3 != 23) {
         if (this.i9 != 1) {
            return 0;
         }

         if (this.u3 == 21) {
            this.f0 = 11;
         } else {
            this.f0 = 10;
            this.u9 = this.a6;
            this.a6 = this.u3;
         }

         this.u3 = 23;
         this.p6 = 0;
      }

      if (var3 == 0) {
         return 0;
      }

      int var4 = 0;
      int var5 = this.c8.l6(this.p6, var1, var2 + var4, var3 - var4);
      var4 += var5;
      this.p6 += var5;
      if (var4 == var3) {
         char var12 = var1[var2 + var3 - 1];
         if (u4.n5((int)var12)) {
            var4--;
            this.p6--;
            if (var4 == 0) {
               this.c8("The buffer is not large enough to fit a surrogate pair. Please provide a buffer of size at least 2 characters.");
            }
         }

         return var4;
      } else {
         if (this.f0 == 11) {
            this.c8.n5(com.aspose.slides.ms.System.d1.n5);
            boolean var6 = false;
            int[] var7 = new int[]{0};
            int[] var8 = new int[]{0};

            while (var4 < var3 && !var6) {
               int[] var9 = new int[]{0};
               var6 = this.n5(var7, var8, var9);
               int var10 = var3 - var4;
               if (var10 > var8[0] - var7[0]) {
                  var10 = var8[0] - var7[0];
               }

               n5(this.k5.n5, var7[0], var1, var2 + var4, var10);
               var4 += var10;
               var7[0] += var10;
            }

            this.f0 = var6 ? 10 : 11;
            if (var4 == var3) {
               char var13 = var1[var2 + var3 - 1];
               if (u4.n5((int)var13)) {
                  var4--;
                  var7[0]--;
                  if (var4 == 0) {
                     this.c8("The buffer is not large enough to fit a surrogate pair. Please provide a buffer of size at least 2 characters.");
                  }
               }
            }

            this.p6 = 0;
            this.c8.n5(this.k5.n5, var7[0], var8[0] - var7[0]);
         }

         return var4;
      }
   }

   @Override
   public final boolean ag_() {
      return true;
   }

   @Override
   public final int ah_() {
      return this.c8.l6();
   }

   @Override
   public final int ai_() {
      return this.c8.k5();
   }

   @Override
   public final IGenericDictionary<String, String> n5(int var1) {
      return this.f2.n5(var1);
   }

   @Override
   public final String l6(String var1) {
      return this.f2.l6(var1);
   }

   public final boolean z7() {
      return this.m3;
   }

   public final void l6(boolean var1) {
      if (this.i9 != 0) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.Xml.v3.n5("Operation is not valid due to the current state of the object."));
      }

      this.m3 = var1;
      if (var1) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.f2, b0$u3.class)) {
            if (this.h2 && this.a5 != null && this.a5.l6() != null) {
               this.f2 = this.a5.l6();
            } else {
               this.f2 = new s2(this.t4);
            }
         }

         this.e5.k5 = this.f2.n5(com.aspose.slides.ms.System.d1.n5);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(this.f2, b0$u3.class)) {
            this.f2 = new b0$u3();
         }

         this.e5.k5 = com.aspose.slides.ms.System.d1.n5;
      }
   }

   public final void k5(boolean var1) {
      if (this.i9 == 4) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.Xml.v3.n5("Operation is not valid due to the current state of the object."));
      }

      this.k7 = var1;
      if (this.k5.q0 == null || this.k5.q0.l6()) {
         this.k5.m1 = !var1;
      }
   }

   public final int v4() {
      return this.z8;
   }

   public final void u9(int var1) {
      if (this.i9 == 4) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.Xml.v3.n5("Operation is not valid due to the current state of the object."));
      }

      if ((var1 & 4294967295L) > 2L) {
         throw new XmlException(
            "Expected WhitespaceHandling.None, or WhitespaceHandling.All, or WhitespaceHandling.Significant.", com.aspose.slides.ms.System.d1.n5
         );
      }

      this.z8 = var1;
   }

   public final int u6() {
      return this.j5;
   }

   public final void h0(int var1) {
      if ((var1 & 4294967295L) > 2L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.j5 = var1;
   }

   public final void c8(int var1) {
      if (var1 != 1 && var1 != 2) {
         throw new XmlException("Expected EntityHandling.ExpandEntities or EntityHandling.ExpandCharEntities.", com.aspose.slides.ms.System.d1.n5);
      }

      this.w1 = var1;
   }

   public final boolean t1() {
      return this.l4;
   }

   public final void n5(o8 var1) {
      this.z3 = var1;
      this.l4 = true;
      this.k5.t9 = null;

      for (int var2 = 0; var2 <= this.o0; var2++) {
         this.b3[var2].t9 = null;
      }
   }

   public final z9 a5() {
      return this.t4;
   }

   public final a3 h2() {
      return this.f2;
   }

   public final boolean v0() {
      return this.r8();
   }

   public final boolean f0() {
      return this.k7;
   }

   public final boolean a3() {
      return this.m3;
   }

   public final boolean p3() {
      return this.p8;
   }

   public final com.aspose.slides.ms.System.r8 x9() {
      if (this.k5.e2.length() > 0 && this.k5.t9 == null && this.z3 != null) {
         this.k5.t9 = this.z3.n5(null, this.k5.e2);
      }

      return this.k5.t9;
   }

   public final boolean y0() {
      return this.k5.z1;
   }

   public final char[] j9() {
      return this.k5.n5;
   }

   public final int z6() {
      return this.k5.k5;
   }

   public final int e9() {
      return this.k5.l6;
   }

   public final void t2(int var1) {
      this.k5.l6 = var1;
   }

   public final int o5() {
      return this.o0 + 1;
   }

   public final boolean j8() {
      return this.k5.m1;
   }

   public final v0 w2() {
      return this.e9;
   }

   public final void s7(int var1) {
      this.e2(var1);
   }

   public final int s0() {
      return this.k5.l6();
   }

   public final int v8() {
      return this.k5.y4;
   }

   public final int v3() {
      return this.u8();
   }

   public final int n5(com.aspose.slides.internal.l7h.a5 var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      int var4 = this.n5(true, var1, var3);
      var2 = var3[0];
      return var4;
   }

   public final int n5(boolean var1, com.aspose.slides.internal.l7h.a5 var2) {
      return this.l6(var1, var2);
   }

   public final void l6(com.aspose.slides.internal.l7h.a5 var1) {
      if (var1 == null) {
         int var2 = this.j4;
         this.j4 = 1;
         this.u3((com.aspose.slides.internal.l7h.a5)null);
         this.j4 = var2;
      } else {
         this.u3(var1);
      }
   }

   public final void k5(com.aspose.slides.internal.l7h.a5 var1) {
      try {
         if (var1 == null) {
            int var2 = this.j4;
            this.j4 = 1;
            this.y4(8);
            this.j4 = var2;
         } else {
            b0$a6 var4 = this.c8;
            this.c8 = this.n5(this.t2 + this.x8 + 1, this.t2);
            this.y4(8);
            this.c8.n5(0, var1);
            this.c8 = var4;
         }
      } catch (XmlException var3) {
         if (!"Unexpected end of file while parsing {0} has occurred.".equals(var3.getResString()) || this.k5.q0 == null) {
            throw var3;
         }

         this.n5(0, "The parameter entity replacement text must nest properly within markup declarations.", null, this.k5.l6(), this.k5.k5());
      }
   }

   private boolean y8() {
      return this.z3 == null || com.aspose.slides.internal.s5g.n5.n5() && !this.l4;
   }

   private o8 c3() {
      return this.z3 == null ? new k1() : this.z3;
   }

   public final boolean n5(o0 var1, int[] var2) {
      boolean var3;
      if (var1.l6()) {
         if (this.y8()) {
            var2[0] = -1;
            return false;
         }

         var3 = this.n5(var1);
      } else {
         this.l6(var1);
         var3 = true;
      }

      var2[0] = this.k5.z3;
      return var3;
   }

   public final boolean n5(o0[] var1, int[] var2) {
      if (this.o0 == -1) {
         var1[0] = null;
         var2[0] = -1;
         return false;
      } else {
         var1[0] = this.k5.q0;
         this.h1();
         var2[0] = this.k5.z3;
         return true;
      }
   }

   public final boolean l6(String var1, String var2) {
      if (this.y8()) {
         return false;
      }

      if (this.k5.t9 == null && !com.aspose.slides.ms.System.d1.n5(this.k5.e2)) {
         this.k5.t9 = this.z3.n5(null, this.k5.e2);
      }

      this.n5(var2, var1, this.k5.t9, null);
      this.k5.q0 = null;
      this.k5.z3 = 0;
      int var3 = this.k5.l6;
      if (this.p8) {
         this.a6((com.aspose.slides.internal.l7h.a5)null);
      }

      if (!this.h0(true)) {
         this.k5.l6 = var3;
      }

      return true;
   }

   public final void k5(String var1, String var2) {
      this.v6();
      this.n5(var2.length(), false);
      this.n5(var1, com.aspose.slides.internal.l7h.j5.z1(), var2);
      this.k5.q0 = null;
      this.k5.z3 = 0;
      this.k5.m1 = false;
   }

   public final void n5(Exception var1) {
      this.l6(var1);
   }

   public final void n5(String var1, y0 var2, y0 var3) {
      b0$a6 var4 = this.n5("SYSTEM", this.t2 + 1);
      var4.n5(var1);
      var2.n5(var4.u9);
      var3.n5(var4.h0);
   }

   public final void l6(String var1, y0 var2, y0 var3) {
      b0$a6 var4 = this.n5("PUBLIC", this.t2 + 1);
      var4.n5(var1);
      var2.n5(var4.u9);
      var3.n5(var4.h0);
   }

   private void n5(int var1, String var2, String var3) {
      this.k5.l6 = var1;
      this.u3(var2, var3);
   }

   private void n5(int var1, String var2, String[] var3) {
      this.k5.l6 = var1;
      this.n5(var2, var3);
   }

   private void n5(int var1, String var2) {
      this.k5.l6 = var1;
      this.u3(var2, com.aspose.slides.ms.System.d1.n5);
   }

   private void c8(String var1) {
      this.u3(var1, com.aspose.slides.ms.System.d1.n5);
   }

   private void n5(String var1, int var2, int var3) {
      this.l6(new XmlException(var1, com.aspose.slides.ms.System.d1.n5, var2, var3, this.k5.e2));
   }

   private void u3(String var1, String var2) {
      this.l6(new XmlException(var1, var2, this.k5.l6(), this.k5.k5(), this.k5.e2));
   }

   private void n5(String var1, String var2, int var3, int var4) {
      this.l6(new XmlException(var1, var2, var3, var4, this.k5.e2));
   }

   private void n5(String var1, String[] var2) {
      this.l6(new XmlException(var1, var2, this.k5.l6(), this.k5.k5(), this.k5.e2));
   }

   private void n5(String var1, String var2, RuntimeException var3) {
      this.n5(var1, new String[]{var2}, var3);
   }

   private void n5(String var1, String[] var2, RuntimeException var3) {
      this.l6(new XmlException(var1, var2, var3, this.k5.l6(), this.k5.k5(), this.k5.e2));
   }

   private void l6(Exception var1) {
      this.l4();
      XmlException var2 = com.aspose.slides.internal.v6g.k5.n5(var1, XmlException.class);
      if (var2 != null) {
         this.c8.n5(var2.getLineNumber(), var2.getLinePosition());
      }

      throw var1;
   }

   private void n5(Exception var1, int var2, int var3) {
      this.l6(new XmlException(var1.getMessage(), (Exception)null, var2, var3, this.k5.e2));
   }

   private void t2(String var1) {
      this.l6(new XmlException(var1, com.aspose.slides.ms.System.d1.n5, this.k5.e2));
   }

   private void a6(String var1, String var2) {
      this.l6(new XmlException(var1, var2, this.k5.e2));
   }

   private void l6(String var1, String[] var2, RuntimeException var3) {
      this.l6(new XmlException(var1, var2, var3, 0, 0, this.k5.e2));
   }

   private void l6(char[] var1, int var2, int var3) {
      this.n5(var3, "'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var1, var2, var3));
   }

   private void l4() {
      this.u3 = 10;
      this.i9 = 2;
   }

   private void n5(int var1, String var2, String var3, int var4, int var5) {
      this.n5(var1, new XmlSchemaException(var2, var3, this.k5.e2, var4, var5));
   }

   private void n5(int var1, XmlSchemaException var2) {
      if (this.e9 != null) {
         this.e9.n5(var2, var1);
      }
   }

   private boolean i6() {
      return this.x8 > 0 && this.u3 >= 22;
   }

   private void a7() {
      if (this.u3 == 23) {
         this.a1();
      } else if (this.u3 == 24) {
         this.w3();
      }

      if (this.u3 == 22) {
         while (this.k5.z3 != this.j9) {
            this.c8(false);
         }

         this.z6 = false;
         this.u3 = this.a6;
         this.a6 = this.t2 > 0 ? 0 : 5;
      }
   }

   private boolean r8() {
      return this.e9 != null;
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.l7h.j5 var2) {
      this.n5(null, com.aspose.slides.ms.System.d1.n5, var1, null, 0, var2);
   }

   private void n5(String var1, com.aspose.slides.internal.z0k.t4 var2, com.aspose.slides.internal.l7h.j5 var3) {
      this.n5(null, var1, var2, null, 0, var3);
   }

   private void n5(com.aspose.slides.ms.System.r8 var1, com.aspose.slides.internal.z0k.t4 var2, com.aspose.slides.internal.l7h.j5 var3) {
      this.n5(var1, var1.toString(), var2, null, 0, var3);
   }

   private void n5(com.aspose.slides.ms.System.r8 var1, String var2, com.aspose.slides.internal.z0k.t4 var3, com.aspose.slides.internal.l7h.j5 var4) {
      this.n5(var1, var2, var3, null, 0, var4);
   }

   private void n5(
      com.aspose.slides.ms.System.r8 var1, String var2, com.aspose.slides.internal.z0k.t4 var3, byte[] var4, int var5, com.aspose.slides.internal.l7h.j5 var6
   ) {
      this.k5.u9 = var3;
      this.k5.t9 = var1;
      this.k5.e2 = var2;
      int var7;
      if (var4 != null) {
         this.k5.c8 = var4;
         this.k5.s7 = var5;
         var7 = this.k5.c8.length;
      } else {
         var7 = l6(var3);
         if (this.k5.c8 == null || this.k5.c8.length < var7) {
            this.k5.c8 = new byte[var7];
         }
      }

      if (this.k5.n5 == null || this.k5.n5.length < var7 + 1) {
         this.k5.n5 = new char[var7 + 1];
      }

      this.k5.t2 = 0;

      while (this.k5.s7 < 4 && this.k5.c8.length - this.k5.s7 > 0) {
         int var8 = var3.read(this.k5.c8, this.k5.s7, this.k5.c8.length - this.k5.s7);
         if (var8 == 0) {
            this.k5.t4 = true;
            break;
         }

         this.k5.s7 += var8;
      }

      if (var6 == null) {
         var6 = this.y5();
      }

      this.n5(var6);
      byte[] var11 = this.k5.u3.c8();
      int var9 = var11.length;
      int var10 = 0;

      while (var10 < var9 && var10 < this.k5.s7 && (this.k5.c8[var10] & 255) == (var11[var10] & 255)) {
         var10++;
      }

      if (var10 == var9) {
         this.k5.t2 = var9;
      }

      this.n1 = this.k5.t2;
      this.k5.m1 = !this.k7;
      this.k5.a6 = true;
      this.u8();
   }

   private void n5(String var1, com.aspose.slides.internal.z0k.y1 var2) {
      this.n5(var1, null, var2);
   }

   private void n5(String var1, com.aspose.slides.ms.System.r8 var2, com.aspose.slides.internal.z0k.y1 var3) {
      this.k5.x8 = var3;
      this.k5.e2 = var1;
      this.k5.t9 = var2;
      if (this.k5.n5 == null) {
         this.k5.n5 = new char[4097];
      }

      this.k5.u3 = com.aspose.slides.internal.l7h.j5.z1();
      this.k5.m1 = !this.k7;
      this.k5.a6 = true;
      this.u8();
   }

   private void n5(String var1, com.aspose.slides.internal.l7h.j5 var2, String var3) {
      this.k5.e2 = var1;
      this.k5.t9 = null;
      int var4 = var3.length();
      this.k5.n5 = new char[var4 + 1];
      com.aspose.slides.ms.System.d1.n5(var3, 0, this.k5.n5, 0, var3.length());
      this.k5.k5 = var4;
      this.k5.n5[var4] = 0;
      this.k5.u3 = var2;
      this.k5.m1 = !this.k7;
      this.k5.z1 = true;
   }

   private void n5(int var1, b1 var2, boolean var3) {
      this.a5 = var2;
      if (var2 != null) {
         if (var2.l6() != null) {
            this.f2 = var2.l6();
            this.e5.k5 = this.f2.n5(com.aspose.slides.ms.System.d1.n5);
         } else {
            this.f2 = new s2(this.t4);
         }

         this.k5.e2 = var2.u9();
         this.k5.t9 = null;
         this.e5.l6 = var2.c8();
         this.e5.n5 = var2.t2();
      } else {
         this.f2 = new s2(this.t4);
         this.k5.e2 = com.aspose.slides.ms.System.d1.n5;
         this.k5.t9 = null;
      }

      this.z7 = this.k5.e2;
      switch (var1) {
         case 1:
            this.a6 = 5;
            break;
         case 2:
            this.k5.a6 = false;
            this.u3 = 3;
            this.a6 = 15;
         case 9:
            break;
         case 17:
            if (!var3) {
               this.u3("XmlNodeType {0} is not supported for partial content parsing.", com.aspose.slides.ms.System.s3.n5(a4.class, var1));
               return;
            }

            this.k5.a6 = false;
            this.u3 = 3;
            this.a6 = 19;
            break;
         default:
            this.u3("XmlNodeType {0} is not supported for partial content parsing.", com.aspose.slides.ms.System.s3.n5(a4.class, var1));
            return;
      }

      this.t1 = var1;
      this.h2 = true;
   }

   private void n5(b1 var1) {
      switch (this.j5) {
         case 0:
            this.t2(
               "For security reasons DTD is prohibited in this XML document. To enable DTD processing set the DtdProcessing property on XmlReaderSettings to Parse and pass the settings into XmlReader.Create method."
            );
         case 1:
         default:
            break;
         case 2:
            this.f8();
      }
   }

   private void r1() {
      o8 var1 = this.c3();
      if (this.k5.t9 == null) {
         this.k5.t9 = var1.n5(null, this.m1);
         this.k5.e2 = this.k5.t9.toString();
      }

      try {
         this.k5(var1);
      } catch (RuntimeException var3) {
         this.l4();
         throw var3;
      }

      if (this.k5.u9 == null) {
         this.a6("Cannot resolve '{0}'.", this.k5.e2);
      }

      this.n5(this.k5.t9, this.k5.e2, this.k5.u9, null);
      this.v4 = this.k5.u3;
   }

   private void k5(Object var1) {
      this.k5.u9 = (com.aspose.slides.internal.z0k.t4)this.c3()
         .n5(this.k5.t9, null, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class));
   }

   private com.aspose.slides.internal.l7h.j5 y5() {
      if (this.k5.s7 < 2) {
         return null;
      }

      int var1 = (this.k5.c8[0] & 255) << 8 | this.k5.c8[1] & 255;
      int var2 = this.k5.s7 >= 4 ? (this.k5.c8[2] & 255) << 8 | this.k5.c8[3] & 0xFF : 0;
      switch (var1) {
         case 0:
            switch (var2) {
               case 60:
                  return com.aspose.slides.ms.System.Xml.l4.a6();
               case 15360:
                  return com.aspose.slides.ms.System.Xml.l4.y2();
               case 65279:
                  return com.aspose.slides.ms.System.Xml.l4.a6();
               case 65534:
                  return com.aspose.slides.ms.System.Xml.l4.y2();
               default:
                  return null;
            }
         case 60:
            if (var2 == 0) {
               return com.aspose.slides.ms.System.Xml.l4.y1();
            }

            return com.aspose.slides.internal.l7h.j5.t4();
         case 15360:
            if (var2 == 0) {
               return com.aspose.slides.ms.System.Xml.l4.u3();
            }

            return com.aspose.slides.internal.l7h.j5.z1();
         case 19567:
            if (var2 == 42900) {
               this.u3("System does not support '{0}' encoding.", "ebcdic");
            }
            break;
         case 61371:
            if ((var2 & 0xFF00) == 48896) {
               return new com.aspose.slides.internal.l7h.u6(true, true);
            }
            break;
         case 65279:
            if (var2 == 0) {
               return com.aspose.slides.ms.System.Xml.l4.y1();
            }

            return com.aspose.slides.internal.l7h.j5.t4();
         case 65534:
            if (var2 == 0) {
               return com.aspose.slides.ms.System.Xml.l4.u3();
            }

            return com.aspose.slides.internal.l7h.j5.z1();
      }

      return null;
   }

   private void n5(com.aspose.slides.internal.l7h.j5 var1) {
      if (var1 == null) {
         this.k5.u3 = com.aspose.slides.internal.l7h.j5.z3();
         this.k5.h0 = new j4();
      } else {
         this.k5.u3 = var1;
         switch (r8.n5(this.k5.u3.s7())) {
            case 0:
               this.k5.h0 = new p6(false);
               break;
            case 1:
               this.k5.h0 = new p6(true);
               break;
            default:
               this.k5.h0 = var1.l6();
         }
      }
   }

   private void l6(com.aspose.slides.internal.l7h.j5 var1) {
      if ((!com.aspose.slides.ms.System.d1.a6(var1.s7(), this.k5.u3.s7()) || com.aspose.slides.internal.v6g.k5.l6(this.k5.h0, j4.class)) && !this.j3) {
         this.k8();
         this.k5.a6 = false;
         this.n5(var1);
         this.u8();
      }
   }

   private com.aspose.slides.internal.l7h.j5 s7(String var1) {
      if (this.k5.u9 == null) {
         return this.k5.u3;
      }

      if (0 != com.aspose.slides.ms.System.d1.a6(var1, "ucs-2", (short)5)
         && 0 != com.aspose.slides.ms.System.d1.a6(var1, "utf-16", (short)5)
         && 0 != com.aspose.slides.ms.System.d1.a6(var1, "iso-10646-ucs-2", (short)5)
         && 0 != com.aspose.slides.ms.System.d1.a6(var1, "ucs-4", (short)5)) {
         com.aspose.slides.internal.l7h.j5 var2 = null;
         if (0 == com.aspose.slides.ms.System.d1.a6(var1, "utf-8", (short)5)) {
            var2 = new com.aspose.slides.internal.l7h.u6(true, true);
         } else {
            try {
               var2 = com.aspose.slides.internal.l7h.j5.k5(var1);
            } catch (UnsupportedOperationException var4) {
               this.n5("System does not support '{0}' encoding.", var1, var4);
            } catch (ArgumentException var5) {
               this.n5("System does not support '{0}' encoding.", var1, var5);
            }
         }

         if (this.j3 && !com.aspose.slides.ms.System.d1.a6(this.k5.u3.s7(), var2.s7())) {
            this.u3("'{0}' is an invalid value for the 'encoding' attribute. The encoding cannot be switched after a call to ResetState.", var1);
         }

         return var2;
      } else {
         if (!"utf-16BE".equals(this.k5.u3.s7()) && !"utf-16".equals(this.k5.u3.s7()) && 0 != com.aspose.slides.ms.System.d1.a6(var1, "ucs-4", (short)5)) {
            if (this.j3) {
               this.u3("'{0}' is an invalid value for the 'encoding' attribute. The encoding cannot be switched after a call to ResetState.", var1);
            } else {
               this.t2("There is no Unicode byte order mark. Cannot switch to Unicode.");
            }
         }

         return this.k5.u3;
      }
   }

   private void k8() {
      if (this.d5 > 0L) {
         this.d1 = this.d1 - (this.k5.k5 - this.k5.l6);
      }

      if (this.s3 > 0L && this.p4()) {
         this.s4 = this.s4 - (this.k5.k5 - this.k5.l6);
      }

      this.k5.t2 = this.n1;
      if (this.k5.l6 > 0) {
         this.k5.t2 = this.k5.t2 + this.k5.u3.n5(this.k5.n5, 0, this.k5.l6);
      }

      this.k5.k5 = this.k5.l6;
      this.k5.z1 = false;
   }

   private void b5() {
      this.l6(new com.aspose.slides.internal.l7h.u6(true, true));
   }

   private int u8() {
      if (this.k5.z1) {
         return 0;
      }

      int var2;
      if (this.k5.a6) {
         if (this.k5.k5 == this.k5.n5.length - 1) {
            for (int var1 = 0; var1 < this.x8; var1++) {
               this.h0[this.t2 + var1 + 1].s7();
            }

            char[] var5 = new char[this.k5.n5.length * 2];
            n5(this.k5.n5, 0, var5, 0, this.k5.n5.length);
            this.k5.n5 = var5;
         }

         if (this.k5.u9 != null && this.k5.s7 - this.k5.t2 < 6 && this.k5.c8.length - this.k5.s7 < 6) {
            byte[] var6 = new byte[this.k5.c8.length * 2];
            n5(this.k5.c8, 0, var6, 0, this.k5.s7);
            this.k5.c8 = var6;
         }

         var2 = this.k5.n5.length - this.k5.k5 - 1;
         if (var2 > 80) {
            var2 = 80;
         }
      } else {
         int var7 = this.k5.n5.length;
         if (var7 - this.k5.k5 <= var7 / 2) {
            for (int var3 = 0; var3 < this.x8; var3++) {
               this.h0[this.t2 + var3 + 1].s7();
            }

            int var11 = this.k5.k5 - this.k5.l6;
            if (var11 < var7 - 1) {
               this.k5.y4 = this.k5.y4 - this.k5.l6;
               if (var11 > 0) {
                  n5(this.k5.n5, this.k5.l6, this.k5.n5, 0, var11);
               }

               this.k5.l6 = 0;
               this.k5.k5 = var11;
            } else {
               char[] var4 = new char[this.k5.n5.length * 2];
               n5(this.k5.n5, 0, var4, 0, this.k5.n5.length);
               this.k5.n5 = var4;
            }
         }

         if (this.k5.u9 != null) {
            int var12 = this.k5.s7 - this.k5.t2;
            if (var12 <= 128) {
               if (var12 == 0) {
                  this.k5.s7 = 0;
               } else {
                  n5(this.k5.c8, this.k5.t2, this.k5.c8, 0, var12);
                  this.k5.s7 = var12;
               }

               this.k5.t2 = 0;
            }
         }

         var2 = this.k5.n5.length - this.k5.k5 - 1;
      }

      if (this.k5.u9 != null) {
         if (!this.k5.t4 && this.k5.t2 == this.k5.s7 && this.k5.c8.length - this.k5.s7 > 0) {
            int var8 = this.k5.u9.read(this.k5.c8, this.k5.s7, this.k5.c8.length - this.k5.s7);
            if (var8 == 0) {
               this.k5.t4 = true;
            }

            this.k5.s7 += var8;
         }

         int var9 = this.k5.t2;
         var2 = this.n3(var2);
         if (var2 == 0 && this.k5.t2 != var9) {
            return this.u8();
         }
      } else if (this.k5.x8 != null) {
         var2 = this.k5.x8.n5(this.k5.n5, this.k5.k5, this.k5.n5.length - this.k5.k5 - 1);
         this.k5.k5 += var2;
      } else {
         var2 = 0;
      }

      this.n5(var2, this.p4());
      if (var2 == 0) {
         this.k5.z1 = true;
      }

      this.k5.n5[this.k5.k5] = 0;
      return var2;
   }

   private int n3(int var1) {
      int var2 = this.k5.s7 - this.k5.t2;
      if (var2 == 0) {
         return 0;
      }

      int var3 = 0;
      boolean var4 = false;

      try {
         int[] var5 = new int[]{var2};
         int[] var10 = new int[]{0};
         boolean[] var11 = new boolean[]{false};
         this.k5.h0.n5(this.k5.c8, this.k5.t2, var5[0], this.k5.n5, this.k5.k5, var1, false, var5, var10, var11);
         var2 = var5[0];
         var3 = var10[0];
         var4 = var11[0];
      } catch (ArgumentException var8) {
         int[] var6 = new int[]{var2};
         int[] var7 = new int[]{var3};
         this.n5(var6, var7);
         var2 = var6[0];
         var3 = var7[0];
      }

      this.k5.t2 += var2;
      this.k5.k5 += var3;
      return var3;
   }

   private void n5(int[] var1, int[] var2) {
      int var3 = 0;
      int var4 = 0;

      try {
         while (var4 < var1[0]) {
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            int[] var8 = new int[]{0};
            int[] var9 = new int[]{0};
            boolean[] var10 = new boolean[]{false};
            this.k5.h0.n5(this.k5.c8, this.k5.t2 + var4, 1, this.k5.n5, this.k5.k5 + var3, 1, false, var8, var9, var10);
            var6 = var8[0];
            var5 = var9[0];
            var7 = var10[0];
            var3 += var5;
            var4 += var6;
         }
      } catch (ArgumentException var11) {
      }

      if (var3 == 0) {
         this.n5(this.k5.k5, "Invalid character in the given encoding.");
      }

      var2[0] = var3;
      var1[0] = var4;
   }

   public final void u3(boolean var1) {
      if (this.u3 != 12) {
         while (this.p4()) {
            this.x0();
         }

         this.k5.n5(var1);
         this.c8 = b0$a6.n5();
         this.u3 = 12;
         this.v4 = null;
         this.z7 = com.aspose.slides.ms.System.d1.n5;
         this.i9 = 4;
         this.t9 = false;
         this.r5();
         this.n5 = null;
      }
   }

   private void n5(int var1, int var2, int var3) {
      n5(this.k5.n5, var1, this.k5.n5, var2, var3);
   }

   private boolean h0(boolean var1) {
      while (true) {
         if (this.k5.k5 - this.k5.l6 < 6) {
            if (this.u8() != 0) {
               continue;
            }
         } else if (f4.n5(this.k5.n5, this.k5.l6, 5, "<?xml") && !this.l6.u3(this.k5.n5[this.k5.l6 + 5])) {
            if (!var1) {
               this.c8.n5(this.k5.l6(), this.k5.k5() + 2);
               this.c8.l6(17, this.i6);
            }

            this.k5.l6 += 5;
            com.aspose.slides.internal.l7h.a5 var13 = var1 ? new com.aspose.slides.internal.l7h.a5() : this.s0;
            byte var3 = 0;
            com.aspose.slides.internal.l7h.j5 var4 = null;

            label280:
            while (true) {
               label316: {
                  int var5 = var13.l6();
                  int var6 = this.a6(var3 == 0 ? null : var13);
                  if (this.k5.n5[this.k5.l6] == '?') {
                     var13.n5(var5);
                     if (this.k5.n5[this.k5.l6 + 1] == '>') {
                        if (var3 == 0) {
                           this.c8(var1 ? "Invalid text declaration." : "Syntax for an XML declaration is invalid.");
                        }

                        this.k5.l6 += 2;
                        if (!var1) {
                           this.c8.n5(var13.toString());
                           var13.n5(0);
                           this.a6 = this.u3;
                           this.u3 = 9;
                        }

                        if (var4 == null) {
                           if (var1) {
                              this.c8("Invalid text declaration.");
                           }

                           if (this.j3) {
                              String var14 = this.k5.u3.s7();
                              if (!"utf-8".equals(var14)
                                 && !"utf-16".equals(var14)
                                 && !"utf-16BE".equals(var14)
                                 && !com.aspose.slides.internal.v6g.k5.l6(this.k5.u3, l4.class)) {
                                 this.u3(
                                    "'{0}' is an invalid value for the 'encoding' attribute. The encoding cannot be switched after a call to ResetState.",
                                    this.k5.u3.n5("A") == 1 ? "UTF-8" : "UTF-16"
                                 );
                              }
                           }

                           if (com.aspose.slides.internal.v6g.k5.l6(this.k5.h0, j4.class)) {
                              this.b5();
                           }
                        } else {
                           this.l6(var4);
                        }

                        this.k5.a6 = false;
                        return true;
                     }

                     if (this.k5.l6 + 1 == this.k5.k5) {
                        break label316;
                     }

                     this.x8("'>'");
                  }

                  if (var6 == 0 && var3 != 0) {
                     this.x8("?>");
                  }

                  int var7 = this.w9();
                  b0$a6 var8 = null;
                  switch (this.k5.n5[this.k5.l6]) {
                     case 'e':
                        if (f4.n5(this.k5.n5, this.k5.l6, var7 - this.k5.l6, "encoding") && (var3 == 1 || var1 && var3 == 0)) {
                           if (!var1) {
                              var8 = this.n5("encoding", 1);
                           }

                           var3 = 1;
                        } else {
                           this.c8(var1 ? "Invalid text declaration." : "Syntax for an XML declaration is invalid.");
                        }
                        break;
                     case 's':
                        if (f4.n5(this.k5.n5, this.k5.l6, var7 - this.k5.l6, "standalone") && (var3 == 1 || var3 == 2) && !var1) {
                           if (!var1) {
                              var8 = this.n5("standalone", 1);
                           }

                           var3 = 2;
                           break;
                        }

                        this.c8(var1 ? "Invalid text declaration." : "Syntax for an XML declaration is invalid.");
                        break;
                     case 'v':
                        if (f4.n5(this.k5.n5, this.k5.l6, var7 - this.k5.l6, "version") && var3 == 0) {
                           if (!var1) {
                              var8 = this.n5("version", 1);
                           }
                           break;
                        }

                        this.c8(var1 ? "Invalid text declaration." : "Syntax for an XML declaration is invalid.");
                        break;
                     default:
                        this.c8(var1 ? "Invalid text declaration." : "Syntax for an XML declaration is invalid.");
                  }

                  if (!var1) {
                     var8.n5(this.k5.l6(), this.k5.k5());
                  }

                  var13.n5(this.k5.n5, this.k5.l6, var7 - this.k5.l6);
                  this.k5.l6 = var7;
                  if (this.k5.n5[this.k5.l6] != '=') {
                     this.a6(var13);
                     if (this.k5.n5[this.k5.l6] != '=') {
                        this.x8("=");
                     }
                  }

                  var13.n5('=');
                  this.k5.l6++;
                  char var9 = this.k5.n5[this.k5.l6];
                  if (var9 != '"' && var9 != '\'') {
                     this.a6(var13);
                     var9 = this.k5.n5[this.k5.l6];
                     if (var9 != '"' && var9 != '\'') {
                        this.u9("\"", "'");
                     }
                  }

                  var13.n5(var9);
                  this.k5.l6++;
                  if (!var1) {
                     var8.c8 = var9;
                     var8.l6(this.k5.l6(), this.k5.k5());
                  }

                  int var10 = this.k5.l6;

                  while (true) {
                     char[] var11 = this.k5.n5;

                     while ((this.l6.n5[var11[var10]] & 255 & 128) != 0) {
                        var10++;
                     }

                     if (this.k5.n5[var10] == var9) {
                        switch (var3) {
                           case 0:
                              if (f4.n5(this.k5.n5, this.k5.l6, var10 - this.k5.l6, "1.0")) {
                                 if (!var1) {
                                    var8.n5(this.k5.n5, this.k5.l6, var10 - this.k5.l6);
                                 }

                                 var3 = 1;
                              } else {
                                 String var15 = com.aspose.slides.ms.System.d1.n5(this.k5.n5, this.k5.l6, var10 - this.k5.l6);
                                 this.u3("Version number '{0}' is invalid.", var15);
                              }
                              break;
                           case 1:
                              String var12 = com.aspose.slides.ms.System.d1.n5(this.k5.n5, this.k5.l6, var10 - this.k5.l6);
                              var4 = this.s7(var12);
                              if (!var1) {
                                 var8.n5(var12);
                              }

                              var3 = 2;
                              break;
                           case 2:
                              if (f4.n5(this.k5.n5, this.k5.l6, var10 - this.k5.l6, "yes")) {
                                 this.v3 = true;
                              } else if (f4.n5(this.k5.n5, this.k5.l6, var10 - this.k5.l6, "no")) {
                                 this.v3 = false;
                              } else {
                                 this.n5("Syntax for an XML declaration is invalid.", this.k5.l6(), this.k5.k5() - 1);
                              }

                              if (!var1) {
                                 var8.n5(this.k5.n5, this.k5.l6, var10 - this.k5.l6);
                              }

                              var3 = 3;
                        }

                        var13.n5(var11, this.k5.l6, var10 - this.k5.l6);
                        var13.n5(var9);
                        this.k5.l6 = var10 + 1;
                        continue label280;
                     }

                     if (var10 != this.k5.k5) {
                        this.c8(var1 ? "Invalid text declaration." : "Syntax for an XML declaration is invalid.");
                        break;
                     }

                     if (this.u8() == 0) {
                        this.c8("There is an unclosed literal string.");
                        break;
                     }
                  }
               }

               if (this.k5.z1 || this.u8() == 0) {
                  this.c8("Unexpected end of file has occurred.");
               }
            }
         }

         if (!var1) {
            this.u3 = this.a6;
         }

         if (this.j3) {
            String var2 = this.k5.u3.s7();
            if (!"utf-8".equals(var2) && !"utf-16".equals(var2) && !"utf-16BE".equals(var2) && !com.aspose.slides.internal.v6g.k5.l6(this.k5.u3, l4.class)) {
               this.u3(
                  "'{0}' is an invalid value for the 'encoding' attribute. The encoding cannot be switched after a call to ResetState.",
                  this.k5.u3.n5("A") == 1 ? "UTF-8" : "UTF-16"
               );
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(this.k5.h0, j4.class)) {
            this.b5();
         }

         this.k5.a6 = false;
         return false;
      }
   }

   private boolean w5() {
      boolean var1 = false;

      while (true) {
         boolean var2 = false;
         int var3 = this.k5.l6;
         char[] var4 = this.k5.n5;
         if (var4[var3] == '<') {
            var2 = true;
            if (this.k5.k5 - var3 >= 4) {
               var3++;
               switch (var4[var3]) {
                  case '!':
                     if (this.k5.k5 - ++var3 >= 2) {
                        if (var4[var3] == '-') {
                           if (var4[var3 + 1] == '-') {
                              this.k5.l6 = var3 + 2;
                              if (this.l5()) {
                                 return true;
                              }
                              continue;
                           }

                           this.l6(var3 + 1, "-");
                        } else if (var4[var3] == '[') {
                           if (this.t1 != 9) {
                              if (this.k5.k5 - ++var3 >= 6) {
                                 if (f4.n5(var4, var3, 6, "CDATA[")) {
                                    this.k5.l6 = var3 + 6;
                                    this.u2();
                                    if (this.t1 == 0) {
                                       this.t1 = 1;
                                    }

                                    return true;
                                 }

                                 this.l6(var3, "CDATA[");
                              }
                           } else {
                              this.n5(this.k5.l6, "Data at the root level is invalid.");
                           }
                        } else {
                           if (this.t1 == 9 || this.t1 == 0) {
                              this.t1 = 9;
                              this.k5.l6 = var3;
                              if (this.d9()) {
                                 return true;
                              }
                              continue;
                           }

                           if ("DOCTYPE".equals(this.z1(var3))) {
                              this.c8("Unexpected DTD declaration.");
                           } else {
                              this.l6(var3, "<!--", "<[CDATA[");
                           }
                        }
                     }
                     break;
                  case '/':
                     this.n5(var3 + 1, "Unexpected end tag.");
                     break;
                  case '?':
                     this.k5.l6 = var3 + 1;
                     if (this.n7()) {
                        return true;
                     }
                     continue;
                  default:
                     if (this.v8) {
                        if (this.t1 == 9) {
                           this.n5(var3, "There are multiple root elements.");
                        }

                        if (this.t1 == 0) {
                           this.t1 = 1;
                        }
                     }

                     this.k5.l6 = var3;
                     this.v8 = true;
                     this.w8();
                     return true;
               }
            }
         } else if (var4[var3] == '&') {
            if (this.t1 != 9) {
               if (this.t1 == 0) {
                  this.t1 = 1;
               }

               int var5 = 0;
               int[] var6 = new int[]{0};
               int var7 = this.n5(false, 1, var6);
               var5 = var6[0];
               switch (var7) {
                  case 0:
                  case 1:
                  case 2:
                     if (this.h5()) {
                        return true;
                     }
                     continue;
                  case 3:
                  case 4:
                  case 5:
                  default:
                     var4 = this.k5.n5;
                     var3 = this.k5.l6;
                     continue;
                  case 6:
                     if (this.u3 == 13) {
                        this.u3 = this.a6;
                     }

                     this.q2();
                     return true;
               }
            }

            this.n5(var3, "Data at the root level is invalid.");
         } else if (var3 != this.k5.k5 && (!this.p8 && !var1 || var4[var3] != 0)) {
            if (this.t1 == 9) {
               if (this.q3()) {
                  return true;
               }
            } else if (this.h5()) {
               if (this.t1 == 0 && this.c8.n5 == 3) {
                  this.t1 = 1;
               }

               return true;
            }
            continue;
         }

         if (this.u8() != 0) {
            var3 = this.k5.l6;
            var3 = this.k5.l6;
            var4 = this.k5.n5;
         } else {
            if (var2) {
               this.c8("Data at the root level is invalid.");
            }

            if (!this.p4()) {
               if (!this.v8 && this.t1 == 9) {
                  this.t2("Root element is missing.");
               }

               if (this.t1 == 0) {
                  this.t1 = this.v8 ? 9 : 1;
               }

               this.r6();
               return false;
            }

            if (this.c8(true)) {
               this.d6();
               return true;
            }
         }
      }
   }

   private boolean q1() {
      while (true) {
         int var1 = this.k5.l6;
         char[] var2 = this.k5.n5;
         label75:
         switch (var2[var1]) {
            case '&':
               if (!this.h5()) {
                  continue;
               }

               return true;
            case '<':
               switch (var2[var1 + 1]) {
                  case '!':
                     var1 += 2;
                     if (this.k5.k5 - var1 >= 2) {
                        if (var2[var1] == '-') {
                           if (var2[var1 + 1] == '-') {
                              this.k5.l6 = var1 + 2;
                              if (!this.l5()) {
                                 continue;
                              }

                              return true;
                           }

                           this.l6(var1 + 1, "-");
                        } else if (var2[var1] == '[') {
                           if (this.k5.k5 - ++var1 >= 6) {
                              if (f4.n5(var2, var1, 6, "CDATA[")) {
                                 this.k5.l6 = var1 + 6;
                                 this.u2();
                                 return true;
                              }

                              this.l6(var1, "CDATA[");
                           }
                        } else if ("DOCTYPE".equals(this.z1(var1))) {
                           this.c8("Unexpected DTD declaration.");
                        } else {
                           this.l6(var1, "<!--", "<[CDATA[");
                        }
                     }
                     break label75;
                  case '/':
                     this.k5.l6 = var1 + 2;
                     this.t3();
                     return true;
                  case '?':
                     this.k5.l6 = var1 + 2;
                     if (!this.n7()) {
                        continue;
                     }

                     return true;
                  default:
                     if (var1 + 1 != this.k5.k5) {
                        this.k5.l6 = var1 + 1;
                        this.w8();
                        return true;
                     }
                     break label75;
               }
            default:
               if (var1 != this.k5.k5) {
                  if (!this.h5()) {
                     continue;
                  }

                  return true;
               }
         }

         if (this.u8() == 0) {
            if (this.k5.k5 - this.k5.l6 != 0) {
               this.u5();
            }

            if (!this.p4()) {
               if (this.t2 == 0 && this.t1 != 9) {
                  this.r6();
                  return false;
               }

               this.u5();
            }

            if (this.c8(true)) {
               this.d6();
               return true;
            }
         }
      }
   }

   private void u5() {
      if (this.t2 == 0 && this.c8.n5 != 1) {
         this.n5(this.k5.k5, "Unexpected end of file has occurred.");
      } else {
         int var1 = this.u3 == 14 ? this.t2 : this.t2 - 1;
         this.s0.n5(0);

         for (; var1 >= 0; var1--) {
            b0$a6 var2 = this.h0[var1];
            if (var2.n5 == 1) {
               this.s0.n5(var2.n5(this.t4));
               if (var1 > 0) {
                  this.s0.n5(", ");
               } else {
                  this.s0.n5(".");
               }
            }
         }

         this.n5(this.k5.k5, "Unexpected end of file has occurred. The following elements are not closed: {0}", this.s0.toString());
      }
   }

   private void w8() {
      int var1 = this.k5.l6;
      char[] var2 = this.k5.n5;
      int var3 = -1;
      this.c8.n5(this.k5.l6(), this.k5.k5());

      label85:
      while (true) {
         if ((this.l6.n5[var2[var1]] & 255 & 4) != 0) {
            var1++;

            label81:
            while (true) {
               while ((this.l6.n5[var2[var1]] & 255 & 8) == 0) {
                  if (var2[var1] != ':') {
                     if (var1 + 1 < this.k5.k5) {
                        break label85;
                     }
                     break label81;
                  }

                  if (var3 == -1) {
                     var3 = var1++;
                     continue label85;
                  }

                  if (this.m3) {
                     this.n5(
                        var1, "The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(':', '\u0000')
                     );
                     break label81;
                  }

                  var1++;
               }

               var1++;
            }
         }

         int[] var4 = new int[]{var3};
         var1 = this.n5(var4);
         var3 = var4[0];
         var2 = this.k5.n5;
         break;
      }

      this.f2.k5();
      if (var3 != -1 && this.m3) {
         int var7 = this.k5.l6;
         int var5 = var3 - var7;
         if (var5 == this.i1.length() && f4.n5(var2, var7, var5, this.i1)) {
            this.c8.n5(1, this.t4.n5(var2, var3 + 1, var1 - var3 - 1), this.i1, null);
         } else {
            this.c8.n5(1, this.t4.n5(var2, var3 + 1, var1 - var3 - 1), this.t4.n5(var2, this.k5.l6, var5), null);
            this.i1 = this.c8.k5;
         }
      } else {
         this.c8.l6(1, this.t4.n5(var2, this.k5.l6, var1 - this.k5.l6));
      }

      char var8 = var2[var1];
      boolean var9 = (this.l6.n5[var8] & 255 & 1) != 0;
      if (var9) {
         this.k5.l6 = var1;
         this.u4();
      } else {
         if (var8 == '>') {
            this.k5.l6 = var1 + 1;
            this.u3 = 6;
         } else if (var8 == '/') {
            if (var1 + 1 == this.k5.k5) {
               this.k5.l6 = var1;
               if (this.u8() == 0) {
                  this.n5(var1, "Unexpected end of file while parsing {0} has occurred.", ">");
               }

               var1 = this.k5.l6;
               var2 = this.k5.n5;
            }

            if (var2[var1 + 1] == '>') {
               this.c8.n5(true);
               this.a6 = this.u3;
               this.u3 = 8;
               this.k5.l6 = var1 + 2;
            } else {
               this.l6(var1, ">");
            }
         } else {
            this.n5(
               var1, "The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(var2, this.k5.k5, var1)
            );
         }

         if (this.w2) {
            this.c2();
         }

         this.s9();
      }
   }

   private void c2() {
      e5 var1 = this.u6.n5(this.c8.l6, this.c8.k5);
      if (var1 != null) {
         if (this.k7 && var1.k5()) {
            for (int var2 = this.t2 + 1; var2 < this.t2 + 1 + this.x8; var2++) {
               b0$a6 var3 = this.h0[var2];
               i1 var4 = var1.n5(var3.k5, var3.l6);
               if (var4 != null && var4.a6()) {
                  if (this.r8() && this.v3 && var4.u9()) {
                     String var5 = var3.h0();
                     var3.c8();
                     if (!com.aspose.slides.ms.System.d1.a6(var5, var3.h0())) {
                        this.n5(
                           0,
                           "StandAlone is 'yes' and the value of the attribute '{0}' contains a definition in an external document that changes on normalization.",
                           var3.n5(this.t4),
                           var3.l6(),
                           var3.k5()
                        );
                     }
                  } else {
                     var3.c8();
                  }
               }
            }
         }

         IGenericEnumerable var12 = var1.u3();
         if (var12 != null) {
            int var13 = this.x8;
            b0$a6[] var14 = null;
            if (this.x8 >= 250) {
               var14 = new b0$a6[this.x8];
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.h0)), this.t2 + 1, com.aspose.slides.ms.System.u3.n5((Object)(var14)), 0, this.x8);
               com.aspose.slides.ms.System.u3.n5(var14, b0$n5.n5());
            }

            IGenericEnumerator var15 = var12.iterator();

            try {
               while (var15.hasNext()) {
                  b3 var6 = (b3)var15.next();
                  if (this.n5(var6, true, var14) && this.r8() && this.v3 && var6.u9()) {
                     String var7 = var6.n5();
                     String var8 = var7.length() == 0 ? var6.l6() : com.aspose.slides.ms.System.d1.n5(new Object[]{var7, ':', var6.l6()});
                     this.n5(0, "Markup for unspecified default attribute '{0}' is external and standalone='yes'.", var8, this.c8.l6(), this.c8.k5());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
                  var15.dispose();
               }
            }

            if (var13 == 0 && this.e2) {
               this.p7();
               this.e2 = false;
            }
         }
      }
   }

   private void t3() {
      b0$a6 var1 = this.h0[this.t2 - 1];
      int var2 = var1.k5.length();
      int var3 = var1.l6.length();

      while (this.k5.k5 - this.k5.l6 < var2 + var3 + 1 && this.u8() != 0) {
      }

      char[] var4 = this.k5.n5;
      int var5;
      if (var1.k5.length() == 0) {
         if (!f4.n5(var4, this.k5.l6, var3, var1.l6)) {
            this.n5(var1);
         }

         var5 = var3;
      } else {
         int var6 = this.k5.l6 + var2;
         if (!f4.n5(var4, this.k5.l6, var2, var1.k5) || var4[var6] != ':' || !f4.n5(var4, var6 + 1, var3, var1.l6)) {
            this.n5(var1);
         }

         var5 = var3 + var2 + 1;
      }

      y0 var10 = new y0(this.k5.n3, this.k5.k5());

      while (true) {
         int var7 = this.k5.l6 + var5;
         var4 = this.k5.n5;
         if (var7 != this.k5.k5) {
            if ((this.l6.n5[var4[var7]] & 255 & 8) != 0 || var4[var7] == ':') {
               this.n5(var1);
            }

            char var8;
            if (var4[var7] != '>') {
               while (this.l6.n5(var8 = var4[var7])) {
                  var7++;
                  switch (var8) {
                     case '\n':
                        this.e2(var7);
                        break;
                     case '\r':
                        if (var4[var7] == '\n') {
                           var7++;
                        } else if (var7 == this.k5.k5 && !this.k5.z1) {
                           continue;
                        }

                        this.e2(var7);
                  }
               }
            }

            if (var4[var7] == '>') {
               this.t2--;
               this.c8 = this.h0[this.t2];
               var10.n5(var1.u9);
               var1.n5 = 15;
               this.k5.l6 = var7 + 1;
               this.a6 = this.t2 > 0 ? this.u3 : 5;
               this.u3 = 7;
               return;
            }

            if (var7 != this.k5.k5) {
               this.l6(var7, ">");
            }
         }

         if (this.u8() == 0) {
            this.u5();
         }
      }
   }

   private void n5(b0$a6 var1) {
      if (var1.n5 == 1) {
         int var2 = 0;
         int[] var3 = new int[]{0};
         int var4 = this.n5(var3);
         var2 = var3[0];
         String[] var5 = new String[]{
            var1.n5(this.t4),
            com.aspose.slides.ms.System.a3.n5(var1.u9.n5, com.aspose.slides.internal.x7n.l6.k5()),
            com.aspose.slides.ms.System.a3.n5(var1.u9.l6, com.aspose.slides.internal.x7n.l6.k5()),
            com.aspose.slides.ms.System.d1.n5(this.k5.n5, this.k5.l6, var4 - this.k5.l6)
         };
         this.n5("The '{0}' start tag on line {1} position {2} does not match the end tag of '{3}'.", var5);
      } else {
         this.c8("Unexpected end tag.");
      }
   }

   private void u4() {
      int var12 = this.k5.l6;
      char[] var2 = this.k5.n5;
      b0$a6 var3 = null;

      label158:
      while (true) {
         int var4 = 0;

         while (true) {
            char var5;
            if ((this.l6.n5[var5 = var2[var12]] & 255 & 1) == 0) {
               byte var6 = 0;
               char var7;
               if ((this.l6.n5[var7 = var2[var12]] & 255 & 4) != 0) {
                  var6 = 1;
               }

               if (var6 == 0) {
                  if (var7 == '>') {
                     this.k5.l6 = var12 + 1;
                     this.u3 = 6;
                     break label158;
                  }

                  if (var7 == '/') {
                     if (var12 + 1 == this.k5.k5) {
                        break;
                     }

                     if (var2[var12 + 1] == '>') {
                        this.k5.l6 = var12 + 2;
                        this.c8.n5(true);
                        this.a6 = this.u3;
                        this.u3 = 8;
                        break label158;
                     }

                     this.l6(var12 + 1, ">");
                  } else {
                     if (var12 == this.k5.k5) {
                        break;
                     }

                     if (var7 != ':' || this.m3) {
                        this.n5(
                           var12,
                           "Name cannot begin with the '{0}' character, hexadecimal value {1}.",
                           XmlException.buildCharExceptionArgs(var2, this.k5.k5, var12)
                        );
                     }
                  }
               }

               if (var12 == this.k5.l6) {
                  this.t4(var12);
               }

               this.k5.l6 = var12;
               int var8 = this.k5.k5();
               int var9 = -1;
               var12 += var6;

               while (true) {
                  char var10;
                  while ((this.l6.n5[var10 = var2[var12]] & 255 & 8) != 0) {
                     var12++;
                  }

                  if (var10 == ':') {
                     if (var9 != -1) {
                        if (this.m3) {
                           this.n5(
                              var12,
                              "The '{0}' character, hexadecimal value {1}, cannot be included in a name.",
                              XmlException.buildCharExceptionArgs(':', '\u0000')
                           );
                           break;
                        }

                        var12++;
                        continue;
                     }

                     var9 = var12++;
                     if ((this.l6.n5[var2[var12]] & 255 & 4) != 0) {
                        var12++;
                        continue;
                     }

                     int[] var18 = new int[]{var9};
                     var12 = this.n5(var18);
                     var9 = var18[0];
                     var2 = this.k5.n5;
                     break;
                  }

                  if (var12 + 1 >= this.k5.k5) {
                     int[] var11 = new int[]{var9};
                     var12 = this.n5(var11);
                     var9 = var11[0];
                     var2 = this.k5.n5;
                  }
                  break;
               }

               var3 = this.k5(var12, var9);
               var3.n5(this.k5.l6(), var8);
               if (var2[var12] != '=') {
                  this.k5.l6 = var12;
                  this.a6((com.aspose.slides.internal.l7h.a5)null);
                  var12 = this.k5.l6;
                  if (var2[var12] != '=') {
                     this.x8("=");
                  }
               }

               char var17 = var2[++var12];
               if (var17 != '"' && var17 != '\'') {
                  this.k5.l6 = var12;
                  this.a6((com.aspose.slides.internal.l7h.a5)null);
                  var12 = this.k5.l6;
                  var17 = var2[var12];
                  if (var17 != '"' && var17 != '\'') {
                     this.u9("\"", "'");
                  }
               }

               this.k5.l6 = ++var12;
               var3.c8 = var17;
               var3.l6(this.k5.l6(), this.k5.k5());

               char var19;
               while ((this.l6.n5[var19 = var2[var12]] & 255 & 128) != 0) {
                  var12++;
               }

               if (var19 == var17) {
                  var3.n5(var2, this.k5.l6, var12 - this.k5.l6);
                  this.k5.l6 = ++var12;
               } else {
                  this.n5(var12, var17, var3);
                  var12 = this.k5.l6;
                  var2 = this.k5.n5;
               }

               if (var3.k5.length() == 0) {
                  if (com.aspose.slides.ms.System.Xml.v8.n5(var3.l6, this.a7)) {
                     this.l6(var3);
                  }
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var3.k5, this.a7)) {
                  this.k5(var3);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var3.k5, this.i6)) {
                  this.u3(var3);
               }
               continue label158;
            }

            if (var5 == '\n') {
               this.e2(var12 + 1);
               var4++;
            } else if (var5 == '\r') {
               if (var2[var12 + 1] == '\n') {
                  this.e2(var12 + 2);
                  var4++;
                  var12++;
               } else {
                  if (var12 + 1 == this.k5.k5) {
                     this.k5.l6 = var12;
                     break;
                  }

                  this.e2(var12 + 1);
                  var4++;
               }
            }

            var12++;
         }

         this.k5.n3 -= var4;
         if (this.u8() != 0) {
            var12 = this.k5.l6;
            var2 = this.k5.n5;
         } else {
            this.u5();
         }
      }

      if (this.w2) {
         this.c2();
      }

      this.s9();
      if (this.e2) {
         this.p7();
         this.e2 = false;
      }

      if (this.y4 >= 250) {
         this.z5();
      }
   }

   private void s9() {
      if (this.c8.k5.length() == 0) {
         this.c8.u3 = this.e5.k5;
      } else {
         this.c8.u3 = this.a6(this.c8);
      }
   }

   private void p7() {
      for (int var1 = this.t2 + 1; var1 < this.t2 + this.x8 + 1; var1++) {
         b0$a6 var2 = this.h0[var1];
         if (var2.n5 == 2 && var2.k5.length() > 0) {
            var2.u3 = this.a6(var2);
         }
      }
   }

   private void z5() {
      if (this.x8 < 250) {
         for (int var1 = this.t2 + 1; var1 < this.t2 + 1 + this.x8; var1++) {
            b0$a6 var2 = this.h0[var1];

            for (int var3 = var1 + 1; var3 < this.t2 + 1 + this.x8; var3++) {
               if (com.aspose.slides.ms.System.Xml.v8.n5(var2.l6, this.h0[var3].l6) && com.aspose.slides.ms.System.Xml.v8.n5(var2.u3, this.h0[var3].u3)) {
                  this.n5("'{0}' is a duplicate attribute name.", this.h0[var3].n5(this.t4), this.h0[var3].l6(), this.h0[var3].k5());
               }
            }
         }
      } else {
         if (this.z1 == null || this.z1.length < this.x8) {
            this.z1 = new b0$a6[this.x8];
         }

         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.h0)), this.t2 + 1, com.aspose.slides.ms.System.u3.n5((Object)(this.z1)), 0, this.x8);
         com.aspose.slides.ms.System.u3.l6(this.z1, 0, this.x8);
         b0$a6 var4 = this.z1[0];

         for (int var5 = 1; var5 < this.x8; var5++) {
            b0$a6 var6 = this.z1[var5];
            if (com.aspose.slides.ms.System.Xml.v8.n5(var4.l6, var6.l6) && com.aspose.slides.ms.System.Xml.v8.n5(var4.u3, var6.u3)) {
               this.n5("'{0}' is a duplicate attribute name.", var6.n5(this.t4), var6.l6(), var6.k5());
            }

            var4 = var6;
         }
      }
   }

   private void l6(b0$a6 var1) {
      if (this.m3) {
         String var2 = this.t4.n5(var1.h0());
         var1.u3 = this.t4.n5("http://www.w3.org/2000/xmlns/");
         if (!this.c8.x8) {
            this.r7();
         }

         this.e5.k5 = var2;
         this.n5(com.aspose.slides.ms.System.d1.n5, var2, var1);
      }
   }

   private void k5(b0$a6 var1) {
      if (this.m3) {
         String var2 = this.t4.n5(var1.h0());
         if (var2.length() == 0) {
            this.n5("Invalid namespace declaration.", var1.h0.n5, var1.h0.l6 - 1);
         }

         this.n5(var1.l6, var2, var1);
      }
   }

   private void u3(b0$a6 var1) {
      switch (r8.n5(var1.l6)) {
         case 2:
            if (!this.c8.x8) {
               this.r7();
            }

            switch (r8.n5(f4.j5(var1.h0()))) {
               case 4:
                  this.e5.n5 = 2;
                  return;
               case 5:
                  this.e5.n5 = 1;
                  return;
               default:
                  this.n5("'{0}' is an invalid xml:space value.", var1.h0(), var1.u9.n5, var1.u9.l6);
                  return;
            }
         case 3:
            if (!this.c8.x8) {
               this.r7();
            }

            this.e5.l6 = var1.h0();
      }
   }

   private void n5(int var1, char var2, b0$a6 var3) {
      int var4 = var1;
      char[] var5 = this.k5.n5;
      int var6 = this.k5.z3;
      int var7 = 0;
      y0 var8 = new y0(this.k5.n3, this.k5.k5());
      b0$a6 var9 = null;

      while (true) {
         while ((this.l6.n5[var5[var4]] & 255 & 128) != 0) {
            var4++;
         }

         if (var4 - this.k5.l6 > 0) {
            this.s0.n5(var5, this.k5.l6, var4 - this.k5.l6);
            this.k5.l6 = var4;
         }

         if (var5[var4] == var2 && var6 == this.k5.z3) {
            break;
         }

         label147: {
            switch (var5[var4]) {
               case '\t':
                  var4++;
                  if (this.k7) {
                     this.s0.n5(' ');
                     this.k5.l6++;
                  }
                  continue;
               case '\n':
                  this.e2(++var4);
                  if (this.k7) {
                     this.s0.n5(' ');
                     this.k5.l6++;
                  }
                  continue;
               case '\r':
                  if (var5[var4 + 1] == '\n') {
                     var4 += 2;
                     if (this.k7) {
                        this.s0.n5(this.k5.m1 ? "  " : " ");
                        this.k5.l6 = var4;
                     }
                     break label147;
                  }

                  if (var4 + 1 < this.k5.k5 || this.k5.z1) {
                     var4++;
                     if (this.k7) {
                        this.s0.n5(' ');
                        this.k5.l6 = var4;
                     }
                     break label147;
                  }
                  break;
               case '"':
               case '\'':
               case '>':
                  var4++;
                  continue;
               case '&':
                  if (var4 - this.k5.l6 > 0) {
                     this.s0.n5(var5, this.k5.l6, var4 - this.k5.l6);
                  }

                  this.k5.l6 = var4;
                  int var19 = this.k5.z3;
                  y0 var11 = new y0(this.k5.n3, this.k5.k5() + 1);
                  int[] var12 = new int[]{var4};
                  int var13 = this.n5(true, 0, var12);
                  var4 = var12[0];
                  switch (var13) {
                     case 0:
                     case 1:
                     case 2:
                        break;
                     case 3:
                     case 4:
                     case 5:
                     default:
                        var4 = this.k5.l6;
                        break;
                     case 6:
                        if (this.j4 == 0 && this.k5.z3 == var6) {
                           int var23 = this.s0.l6() - var7;
                           if (var23 > 0) {
                              b0$a6 var25 = new b0$a6();
                              var8.n5(var25.u9);
                              var25.t2 = var3.t2 + 1;
                              var25.n5(3, this.s0.n5(var7, var23));
                              b0$a6[] var28 = new b0$a6[]{var9};
                              this.n5(var3, var25, var28);
                              var9 = var28[0];
                           }

                           this.k5.l6++;
                           String var26 = this.m8();
                           b0$a6 var29 = new b0$a6();
                           var11.n5(var29.u9);
                           var29.t2 = var3.t2 + 1;
                           var29.l6(5, var26);
                           b0$a6[] var17 = new b0$a6[]{var9};
                           this.n5(var3, var29, var17);
                           var9 = var17[0];
                           this.s0.n5('&');
                           this.s0.n5(var26);
                           this.s0.n5(';');
                           var7 = this.s0.l6();
                           var8.n5(this.k5.l6(), this.k5.k5());
                           this.t9 = true;
                        } else {
                           this.k5.l6++;
                           this.m8();
                        }

                        var4 = this.k5.l6;
                        break;
                     case 7:
                        if (this.j4 == 0 && var19 == var6) {
                           int var14 = this.s0.l6() - var7;
                           if (var14 > 0) {
                              b0$a6 var15 = new b0$a6();
                              var8.n5(var15.u9);
                              var15.t2 = var3.t2 + 1;
                              var15.n5(3, this.s0.n5(var7, var14));
                              b0$a6[] var16 = new b0$a6[]{var9};
                              this.n5(var3, var15, var16);
                              var9 = var16[0];
                           }

                           b0$a6 var24 = new b0$a6();
                           var11.n5(var24.u9);
                           var24.t2 = var3.t2 + 1;
                           var24.l6(5, this.k5.q0.n5());
                           b0$a6[] var27 = new b0$a6[]{var9};
                           this.n5(var3, var24, var27);
                           var9 = var27[0];
                           this.t9 = true;
                        }

                        var4 = this.k5.l6;
                  }

                  var5 = this.k5.n5;
                  continue;
               case '<':
                  this.n5(var4, "'{0}', hexadecimal value {1}, is an invalid attribute character.", XmlException.buildCharExceptionArgs('<', '\u0000'));
                  break;
               default:
                  label129:
                  if (var4 != this.k5.k5) {
                     char var10 = var5[var4];
                     if (u4.n5((int)var10)) {
                        if (var4 + 1 == this.k5.k5) {
                           break label129;
                        }

                        if (u4.l6((int)var5[++var4])) {
                           var4++;
                           continue;
                        }
                     }

                     this.l6(var5, this.k5.k5, var4);
                  }
            }

            if (this.u8() == 0) {
               if (this.k5.k5 - this.k5.l6 > 0) {
                  if (this.k5.n5[this.k5.l6] != '\r') {
                     this.c8("Unexpected end of file has occurred.");
                  }
               } else {
                  if (!this.p4()) {
                     if (this.t1 == 2) {
                        if (var6 != this.k5.z3) {
                           this.c8("Entity replacement text must nest properly within markup declarations.");
                        }
                        break;
                     }

                     this.c8("There is an unclosed literal string.");
                  }

                  if (this.c8(true)) {
                     this.c8("An internal error has occurred.");
                  }

                  if (var6 == this.k5.z3) {
                     var7 = this.s0.l6();
                     var8.n5(this.k5.l6(), this.k5.k5());
                  }
               }
            }

            var4 = this.k5.l6;
            var5 = this.k5.n5;
            continue;
         }

         this.e2(var4);
      }

      if (var3.n3 != null) {
         int var20 = this.s0.l6() - var7;
         if (var20 > 0) {
            b0$a6 var21 = new b0$a6();
            var8.n5(var21.u9);
            var21.t2 = var3.t2 + 1;
            var21.n5(3, this.s0.n5(var7, var20));
            b0$a6[] var22 = new b0$a6[]{var9};
            this.n5(var3, var21, var22);
            var9 = var22[0];
         }
      }

      this.k5.l6 = var4 + 1;
      var3.n5(this.s0.toString());
      this.s0.n5(0);
   }

   private void n5(b0$a6 var1, b0$a6 var2, b0$a6[] var3) {
      if (var3[0] == null) {
         var3[0] = var2;
         var1.n3 = var2;
      } else {
         var3[0].n3 = var2;
         var3[0] = var2;
      }
   }

   private boolean h5() {
      int[] var1 = new int[]{0};
      int[] var2 = new int[]{0};
      int[] var3 = new int[]{0};
      if (this.j4 != 0) {
         while (!this.n5(var1, var2, var3)) {
         }
      } else {
         this.c8.n5(this.k5.l6(), this.k5.k5());
         boolean var4 = this.n5(var1, var2, var3);
         if (var4) {
            if (var2[0] - var1[0] != 0) {
               int var5 = this.t9(var3[0]);
               if (var5 != 0) {
                  this.c8.n5(var5, this.k5.n5, var1[0], var2[0] - var1[0]);
                  return true;
               }
            }
         } else if (this.p8) {
            while (true) {
               if (var2[0] - var1[0] > 0) {
                  this.s0.n5(this.k5.n5, var1[0], var2[0] - var1[0]);
               }

               if (this.n5(var1, var2, var3)) {
                  if (var2[0] - var1[0] > 0) {
                     this.s0.n5(this.k5.n5, var1[0], var2[0] - var1[0]);
                  }

                  int var7 = this.t9(var3[0]);
                  if (var7 != 0) {
                     this.c8.n5(var7, this.s0.toString());
                     this.s0.n5(0);
                     return true;
                  }

                  this.s0.n5(0);
                  break;
               }
            }
         } else {
            boolean var8 = false;
            if (var3[0] > 32) {
               this.c8.n5(3, this.k5.n5, var1[0], var2[0] - var1[0]);
               this.a6 = this.u3;
               this.u3 = 21;
               return true;
            }

            if (var2[0] - var1[0] > 0) {
               this.s0.n5(this.k5.n5, var1[0], var2[0] - var1[0]);
            }

            do {
               var8 = this.n5(var1, var2, var3);
               if (var2[0] - var1[0] > 0) {
                  this.s0.n5(this.k5.n5, var1[0], var2[0] - var1[0]);
               }
            } while (!var8 && var3[0] <= 32 && this.s0.l6() < 4096);

            int var6 = this.s0.l6() < 4096 ? this.t9(var3[0]) : 3;
            if (var6 != 0) {
               this.c8.n5(var6, this.s0.toString());
               this.s0.n5(0);
               if (!var8) {
                  this.a6 = this.u3;
                  this.u3 = 21;
               }

               return true;
            }

            this.s0.n5(0);
            if (!var8) {
               while (!this.n5(var1, var2, var3)) {
               }
            }
         }
      }

      if (this.u3 == 16) {
         this.d6();
         this.u3 = this.a6;
         return true;
      } else if (this.u3 == 13) {
         this.u3 = this.u9;
         this.q2();
         return true;
      } else {
         return false;
      }
   }

   private boolean n5(int[] var1, int[] var2, int[] var3) {
      char[] var4 = this.k5.n5;
      int var5 = this.k5.l6;
      int var6 = 0;
      int var7 = -1;
      int var8 = var3[0];

      while (true) {
         char var9;
         while ((this.l6.n5[var9 = var4[var5]] & 255 & 64) != 0) {
            var8 |= var9;
            var5++;
         }

         label167: {
            label166: {
               label165: {
                  label190: {
                     label162: {
                        switch (var9) {
                           case '\t':
                              var5++;
                              continue;
                           case '\n':
                              this.e2(++var5);
                              continue;
                           case '\r':
                              if (var4[var5 + 1] == '\n') {
                                 if (!this.k5.m1 && this.j4 == 0) {
                                    if (var5 - this.k5.l6 > 0) {
                                       if (var6 == 0) {
                                          var6 = 1;
                                          var7 = var5;
                                       } else {
                                          this.n5(var7 + var6, var7, var5 - var7 - var6);
                                          var7 = var5 - var6;
                                          var6++;
                                       }
                                    } else {
                                       this.k5.l6++;
                                    }
                                 }

                                 var5 += 2;
                                 break label167;
                              }

                              if (var5 + 1 < this.k5.k5 || this.k5.z1) {
                                 if (!this.k5.m1) {
                                    var4[var5] = '\n';
                                 }

                                 var5++;
                                 break label167;
                              }
                              break;
                           case '&':
                              int var19 = 0;
                              int var11 = 0;
                              int[] var12 = new int[]{0};
                              int[] var13 = new int[]{0};
                              int var22;
                              boolean var15 = (var22 = this.l6(var5, var12, var13)) > 0;
                              var19 = var12[0];
                              var11 = var13[0];
                              if (var15) {
                                 if (var6 > 0) {
                                    this.n5(var7 + var6, var7, var5 - var7 - var6);
                                 }

                                 var7 = var5 - var6;
                                 var6 += var22 - var5 - var19;
                                 var5 = var22;
                                 if (!this.l6.n5(var4[var22 - var19]) || this.p8 && var11 == 0) {
                                    var8 |= 255;
                                 }
                                 continue;
                              }

                              if (var5 <= this.k5.l6) {
                                 int[] var16 = new int[]{var5};
                                 int var17 = this.n5(false, 0, var16);
                                 var5 = var16[0];
                                 switch (var17) {
                                    case 0:
                                       if (!this.p8) {
                                          if (!this.l6.n5(this.k5.n5[var5 - 1])) {
                                             var8 |= 255;
                                          }
                                       } else {
                                          var8 |= 255;
                                       }
                                       break label166;
                                    case 1:
                                    case 2:
                                       if (!this.l6.n5(this.k5.n5[var5 - 1])) {
                                          var8 |= 255;
                                       }
                                       break label166;
                                    case 3:
                                    case 4:
                                    case 5:
                                    default:
                                       var5 = this.k5.l6;
                                       break label166;
                                    case 6:
                                       this.a6 = this.u3;
                                       this.u3 = 13;
                                       break label190;
                                 }
                              }
                           case '<':
                              break label162;
                           case ']':
                              if (this.k5.k5 - var5 >= 3 || this.k5.z1) {
                                 if (var4[var5 + 1] == ']' && var4[var5 + 2] == '>') {
                                    this.n5(var5, "']]>' is not allowed in character data.");
                                 }

                                 var8 |= 93;
                                 var5++;
                                 continue;
                              }
                              break;
                           default:
                              label157:
                              if (var5 != this.k5.k5) {
                                 char var14 = var4[var5];
                                 if (u4.n5((int)var14)) {
                                    if (var5 + 1 == this.k5.k5) {
                                       break label157;
                                    }

                                    if (u4.l6((int)var4[++var5])) {
                                       var5++;
                                       var8 |= var14;
                                       continue;
                                    }
                                 }

                                 int var10 = var5 - this.k5.l6;
                                 if (this.q0(var5)) {
                                    var4 = this.k5.n5;
                                    var5 = this.k5.l6 + var10;
                                    break label162;
                                 }

                                 this.l6(this.k5.n5, this.k5.k5, this.k5.l6 + var10);
                              }
                        }

                        if (var5 <= this.k5.l6) {
                           if (this.u8() != 0) {
                              break label165;
                           }

                           if (this.k5.k5 - this.k5.l6 > 0) {
                              if (this.k5.n5[this.k5.l6] != '\r' && this.k5.n5[this.k5.l6] != ']') {
                                 this.c8("Unexpected end of file has occurred.");
                              }
                              break label165;
                           }

                           if (this.p4()) {
                              if (!this.c8(true)) {
                                 break label165;
                              }

                              this.a6 = this.u3;
                              this.u3 = 16;
                           }
                           break label190;
                        }
                     }

                     if (this.j4 == 0 && var6 > 0) {
                        this.n5(var7 + var6, var7, var5 - var7 - var6);
                     }

                     var1[0] = this.k5.l6;
                     var2[0] = var5 - var6;
                     this.k5.l6 = var5;
                     var3[0] = var8;
                     return var9 == '<';
                  }

                  var1[0] = var2[0] = var5;
                  return true;
               }

               var5 = this.k5.l6;
               var4 = this.k5.n5;
               continue;
            }

            var4 = this.k5.n5;
            continue;
         }

         this.e2(var5);
      }
   }

   private void a8() {
      this.c8.n5(this.p6, this.s0);
      int[] var1 = new int[]{0};
      int[] var2 = new int[]{0};
      int[] var3 = new int[]{0};

      while (!this.n5(var1, var2, var3)) {
         this.s0.n5(this.k5.n5, var1[0], var2[0] - var1[0]);
      }

      this.s0.n5(this.k5.n5, var1[0], var2[0] - var1[0]);
      this.c8.n5(this.s0.toString());
      this.s0.n5(0);
   }

   private void f4() {
      switch (this.u3) {
         case 22:
         default:
            break;
         case 23:
            if (this.f0 == 11) {
               this.a8();
               this.f0 = 10;
            } else if (this.p6 > 0) {
               this.c8.n5(com.aspose.slides.ms.System.d1.k5(this.c8.h0(), this.p6));
               this.p6 = 0;
            }
            break;
         case 24:
         case 25:
            switch (this.f0) {
               case 12:
                  if (this.p6 > 0) {
                     this.c8.n5(com.aspose.slides.ms.System.d1.k5(this.c8.h0(), this.p6));
                     this.p6 = 0;
                  }
                  break;
               case 13:
                  this.a8();
                  this.f0 = 12;
                  break;
               case 14:
                  this.c8.n5(com.aspose.slides.ms.System.d1.n5);
            }
      }
   }

   private void y9() {
      int[] var1 = new int[]{0};
      int[] var2 = new int[]{0};
      int[] var3 = new int[]{0};
      this.u3 = this.a6;

      while (!this.n5(var1, var2, var3)) {
      }
   }

   private void a1() {
      this.p6 = 0;
      if (this.f0 == 11) {
         this.y9();
      } else {
         this.u3 = this.a6;
         this.a6 = this.u9;
      }
   }

   private void w3() {
      this.p6 = 0;
      if (this.f0 == 13) {
         this.y9();
      } else {
         this.u3 = this.a6;
         this.a6 = this.u9;
      }

      if (this.f0 != 14) {
         while (this.t2(true)) {
         }
      }
   }

   private void i4() {
      this.w3();
      if (this.c8.n5 != 15) {
         this.u3("'{0}' is an invalid XmlNodeType.", com.aspose.slides.ms.System.s3.n5(a4.class, this.c8.n5));
      }

      this.c3.u9();
   }

   private boolean q3() {
      int var1 = this.a2();
      if (var1 == 0) {
         this.a6((com.aspose.slides.internal.l7h.a5)null);
         if (this.k5.n5[this.k5.l6] == '<' || this.k5.k5 - this.k5.l6 == 0 || this.q0(this.k5.l6)) {
            return false;
         }
      } else {
         this.c8.n5(this.k5.l6(), this.k5.k5());
         this.a6(this.s0);
         if (this.k5.n5[this.k5.l6] == '<' || this.k5.k5 - this.k5.l6 == 0 || this.q0(this.k5.l6)) {
            if (this.s0.l6() > 0) {
               this.c8.n5(var1, this.s0.toString());
               this.s0.n5(0);
               return true;
            }

            return false;
         }
      }

      if (this.l6.a6(this.k5.n5[this.k5.l6])) {
         this.c8("Data at the root level is invalid.");
      } else {
         this.l6(this.k5.n5, this.k5.k5, this.k5.l6);
      }

      return false;
   }

   private void q2() {
      this.k5.l6++;
      this.c8.n5(this.k5.l6(), this.k5.k5());
      this.c8.l6(5, this.m8());
   }

   private int n5(boolean var1, int var2, int[] var3) {
      if (this.k5.l6 + 1 == this.k5.k5 && this.u8() == 0) {
         this.c8("Unexpected end of file has occurred.");
      }

      if (this.k5.n5[this.k5.l6 + 1] == '#') {
         boolean var10 = false;
         int[] var11 = new int[]{0};
         var3[0] = this.n5(var2 != 1, null, var11);
         return var11[0];
      }

      var3[0] = this.l6(var2 != 1, null);
      if (var3[0] >= 0) {
         return 2;
      }

      if (var2 != 2 && (this.w1 == 1 || var1 && this.j8)) {
         this.k5.l6++;
         int var5 = this.k5.k5();

         int var4;
         try {
            var4 = this.w9();
         } catch (XmlException var9) {
            this.n5("An error occurred while parsing EntityName.", this.k5.l6(), var5);
            return 4;
         }

         if (this.k5.n5[var4] != ';') {
            this.l6(var4, ";");
         }

         int var6 = this.k5.k5();
         String var7 = this.t4.n5(this.k5.n5, this.k5.l6, var4 - this.k5.l6);
         this.k5.l6 = var4 + 1;
         var3[0] = -1;
         int var8 = this.n5(var7, var1, false, var6);
         this.z7 = this.k5.e2;
         this.v4 = this.k5.u3;
         return var8;
      } else {
         return 6;
      }
   }

   private int n5(String var1, boolean var2, boolean var3, int var4) {
      o0 var5 = null;
      if (this.u6 == null && this.a5 != null && this.a5.x8() && this.j5 == 2) {
         this.f8();
      }

      if (this.u6 == null || (var5 = this.u6.n5(var1)) == null) {
         if (this.y8) {
            com.aspose.slides.internal.b8c.v6 var6 = new com.aspose.slides.internal.b8c.v6(new k6(var1), false);
            var6.u3(com.aspose.slides.ms.System.d1.n5);
            var5 = var6;
         } else {
            this.n5("Reference to undeclared entity '{0}'.", var1, this.k5.l6(), var4);
         }
      }

      if (var5.u3()) {
         if (this.y8) {
            com.aspose.slides.internal.b8c.v6 var7 = new com.aspose.slides.internal.b8c.v6(new k6(var1), false);
            var7.u3(com.aspose.slides.ms.System.d1.n5);
            var5 = var7;
         } else {
            this.n5("Reference to unparsed entity '{0}'.", var1, this.k5.l6(), var4);
         }
      }

      if (this.v3 && var5.k5()) {
         this.n5("Standalone document declaration must have a value of 'no' because an external entity '{0}' is referenced.", var5.n5(), this.k5.l6(), var4);
      }

      if (var5.l6()) {
         if (var2) {
            this.n5("External entity '{0}' reference cannot appear in the attribute value.", var1, this.k5.l6(), var4);
            return 4;
         }

         if (this.j4 == 2) {
            return 4;
         }

         if (this.y8()) {
            if (var3) {
               this.n5(var5);
               this.c8.s7 = this.k5.z3;
               return 5;
            } else {
               return 4;
            }
         } else {
            this.n5(var5);
            this.c8.s7 = this.k5.z3;
            return var2 && this.j8 ? 7 : 3;
         }
      } else {
         if (this.j4 == 2) {
            return 4;
         }

         this.l6(var5);
         this.c8.s7 = this.k5.z3;
         return var2 && this.j8 ? 7 : 3;
      }
   }

   private boolean p4() {
      return this.o0 >= 0;
   }

   private boolean c8(boolean var1) {
      if (this.o0 == -1) {
         this.c8("An internal error has occurred.");
      }

      if (this.k5.k7) {
         this.t2--;
         if (var1 && this.k5.z3 != this.h0[this.t2].s7) {
            this.c8("Incomplete entity contents.");
         }

         this.f5 = this.k5.q0;
         this.h1();
         return true;
      } else {
         if (var1 && this.k5.z3 != this.h0[this.t2].s7) {
            this.c8("Incomplete entity contents.");
         }

         this.h1();
         this.v4 = this.k5.u3;
         this.z7 = this.k5.e2;
         return false;
      }
   }

   private void d6() {
      this.v4 = this.k5.u3;
      this.z7 = this.k5.e2;
      this.c8 = this.h0[this.t2];
      this.c8.l6(16, this.f5.n5());
      this.c8.u9.n5(this.k5.n3, this.k5.k5() - 1);
      if (this.t2 == 0 && this.u3 == 0) {
         this.u3 = 5;
      }
   }

   private void y6() {
      this.c8 = this.h0[this.t2 + this.x8 + 1];
      this.c8.u9.l6 = this.c8.u9.l6 + this.c8.l6.length();
      this.c8.n5 = 16;
   }

   private boolean n7() {
      return this.u3((com.aspose.slides.internal.l7h.a5)null);
   }

   private boolean u3(com.aspose.slides.internal.l7h.a5 var1) {
      if (this.j4 == 0) {
         this.c8.n5(this.k5.l6(), this.k5.k5());
      }

      int var2 = this.w9();
      String var3 = this.t4.n5(this.k5.n5, this.k5.l6, var2 - this.k5.l6);
      if (com.aspose.slides.ms.System.d1.a6(var3, "xml", (short)5) == 0) {
         this.u3(
            com.aspose.slides.ms.System.d1.a6(var3, "xml")
               ? "Unexpected XML declaration. The XML declaration must be the first node in the document, and no white space characters are allowed to appear before it."
               : "'{0}' is an invalid name for processing instructions.",
            var3
         );
      }

      this.k5.l6 = var2;
      if (var1 == null) {
         if (!this.r4 && this.j4 == 0) {
            this.c8.l6(7, var3);
         }
      } else {
         var1.n5(var3);
      }

      char var4 = this.k5.n5[this.k5.l6];
      if (this.a6(var1) == 0) {
         if (this.k5.k5 - this.k5.l6 < 2) {
            this.u8();
         }

         if (var4 != '?' || this.k5.n5[this.k5.l6 + 1] != '>') {
            this.n5(
               "The '{0}' character, hexadecimal value {1}, cannot be included in a name.",
               XmlException.buildCharExceptionArgs(this.k5.n5, this.k5.k5, this.k5.l6)
            );
         }
      }

      int[] var5 = new int[]{0};
      int[] var6 = new int[]{0};
      boolean var7 = this.l6(var5, var6);
      if (var7) {
         if (var1 == null) {
            if (this.r4) {
               return false;
            }

            if (this.j4 == 0) {
               this.c8.n5(this.k5.n5, var5[0], var6[0] - var5[0]);
            }
         } else {
            var1.n5(this.k5.n5, var5[0], var6[0] - var5[0]);
         }
      } else {
         com.aspose.slides.internal.l7h.a5 var8;
         if (var1 == null) {
            if (this.r4 || this.j4 != 0) {
               while (!this.l6(var5, var6)) {
               }

               return false;
            }

            var8 = this.s0;
         } else {
            var8 = var1;
         }

         do {
            var8.n5(this.k5.n5, var5[0], var6[0] - var5[0]);
         } while (!this.l6(var5, var6));

         var8.n5(this.k5.n5, var5[0], var6[0] - var5[0]);
         if (var1 == null) {
            this.c8.n5(this.s0.toString());
            this.s0.n5(0);
         }
      }

      return true;
   }

   private boolean l6(int[] var1, int[] var2) {
      if (this.k5.k5 - this.k5.l6 < 2 && this.u8() == 0) {
         this.n5(this.k5.k5, "Unexpected end of file while parsing {0} has occurred.", "PI");
      }

      int var3 = this.k5.l6;
      char[] var4 = this.k5.n5;
      int var5 = 0;
      int var6 = -1;

      label89:
      while (true) {
         char var7;
         while ((this.l6.n5[var7 = var4[var3]] & 255 & 64) != 0 && var7 != '?') {
            var3++;
         }

         switch (var4[var3]) {
            case '\t':
            case '&':
            case '<':
            case ']':
               var3++;
               break;
            case '\n':
               this.e2(++var3);
               break;
            case '\r':
               if (var4[var3 + 1] == '\n') {
                  if (!this.k5.m1 && this.j4 == 0) {
                     if (var3 - this.k5.l6 > 0) {
                        if (var5 == 0) {
                           var5 = 1;
                           var6 = var3;
                        } else {
                           this.n5(var6 + var5, var6, var3 - var6 - var5);
                           var6 = var3 - var5;
                           var5++;
                        }
                     } else {
                        this.k5.l6++;
                     }
                  }

                  var3 += 2;
               } else {
                  if (var3 + 1 >= this.k5.k5 && !this.k5.z1) {
                     break label89;
                  }

                  if (!this.k5.m1) {
                     var4[var3] = '\n';
                  }

                  var3++;
               }

               this.e2(var3);
               break;
            case '?':
               if (var4[var3 + 1] == '>') {
                  if (var5 > 0) {
                     this.n5(var6 + var5, var6, var3 - var6 - var5);
                     var2[0] = var3 - var5;
                  } else {
                     var2[0] = var3;
                  }

                  var1[0] = this.k5.l6;
                  this.k5.l6 = var3 + 2;
                  return true;
               }

               if (var3 + 1 == this.k5.k5) {
                  break label89;
               }

               var3++;
               break;
            default:
               if (var3 == this.k5.k5) {
                  break label89;
               }

               char var8 = var4[var3];
               if (u4.n5((int)var8)) {
                  if (var3 + 1 == this.k5.k5) {
                     break label89;
                  }

                  if (u4.l6((int)var4[++var3])) {
                     var3++;
                     continue;
                  }
               }

               this.l6(var4, this.k5.k5, var3);
         }
      }

      if (var5 > 0) {
         this.n5(var6 + var5, var6, var3 - var6 - var5);
         var2[0] = var3 - var5;
      } else {
         var2[0] = var3;
      }

      var1[0] = this.k5.l6;
      this.k5.l6 = var3;
      return false;
   }

   private boolean l5() {
      if (this.c4) {
         int var1 = this.j4;
         this.j4 = 1;
         this.y4(8);
         this.j4 = var1;
         return false;
      } else {
         this.y4(8);
         return true;
      }
   }

   private void u2() {
      this.y4(4);
   }

   private void y4(int var1) {
      int[] var2 = new int[]{0};
      int[] var3 = new int[]{0};
      if (this.j4 == 0) {
         this.c8.n5(this.k5.l6(), this.k5.k5());
         boolean var4 = this.n5(var1, var2, var3);
         if (var4) {
            this.c8.n5(var1, this.k5.n5, var2[0], var3[0] - var2[0]);
         } else {
            do {
               this.s0.n5(this.k5.n5, var2[0], var3[0] - var2[0]);
            } while (!this.n5(var1, var2, var3));

            this.s0.n5(this.k5.n5, var2[0], var3[0] - var2[0]);
            this.c8.n5(var1, this.s0.toString());
            this.s0.n5(0);
         }
      } else {
         while (!this.n5(var1, var2, var3)) {
         }
      }
   }

   private boolean n5(int var1, int[] var2, int[] var3) {
      if (this.k5.k5 - this.k5.l6 < 3 && this.u8() == 0) {
         this.u3("Unexpected end of file while parsing {0} has occurred.", var1 == 8 ? "Comment" : "CDATA");
      }

      int var4 = this.k5.l6;
      char[] var5 = this.k5.n5;
      int var6 = 0;
      int var7 = -1;
      int var8 = var1 == 8 ? 45 : 93;

      label110:
      while (true) {
         char var9;
         while ((this.l6.n5[var9 = var5[var4]] & 255 & 64) != 0 && var9 != var8) {
            var4++;
         }

         if (var5[var4] == var8) {
            if (var5[var4 + 1] == var8) {
               if (var5[var4 + 2] == '>') {
                  if (var6 > 0) {
                     this.n5(var7 + var6, var7, var4 - var7 - var6);
                     var3[0] = var4 - var6;
                  } else {
                     var3[0] = var4;
                  }

                  var2[0] = this.k5.l6;
                  this.k5.l6 = var4 + 3;
                  return true;
               }

               if (var4 + 2 == this.k5.k5) {
                  break;
               }

               if (var1 == 8) {
                  this.n5(var4, "An XML comment cannot contain '--', and '-' cannot be the last character.");
               }
            } else if (var4 + 1 == this.k5.k5) {
               break;
            }

            var4++;
         } else {
            switch (var5[var4]) {
               case '\t':
               case '&':
               case '<':
               case ']':
                  var4++;
                  break;
               case '\n':
                  this.e2(++var4);
                  break;
               case '\r':
                  if (var5[var4 + 1] == '\n') {
                     if (!this.k5.m1 && this.j4 == 0) {
                        if (var4 - this.k5.l6 > 0) {
                           if (var6 == 0) {
                              var6 = 1;
                              var7 = var4;
                           } else {
                              this.n5(var7 + var6, var7, var4 - var7 - var6);
                              var7 = var4 - var6;
                              var6++;
                           }
                        } else {
                           this.k5.l6++;
                        }
                     }

                     var4 += 2;
                  } else {
                     if (var4 + 1 >= this.k5.k5 && !this.k5.z1) {
                        break label110;
                     }

                     if (!this.k5.m1) {
                        var5[var4] = '\n';
                     }

                     var4++;
                  }

                  this.e2(var4);
                  break;
               default:
                  if (var4 == this.k5.k5) {
                     break label110;
                  }

                  char var10 = var5[var4];
                  if (u4.n5((int)var10)) {
                     if (var4 + 1 == this.k5.k5) {
                        break label110;
                     }

                     if (u4.l6((int)var5[++var4])) {
                        var4++;
                        continue;
                     }
                  }

                  this.l6(var5, this.k5.k5, var4);
                  break label110;
            }
         }
      }

      if (var6 > 0) {
         this.n5(var7 + var6, var7, var4 - var7 - var6);
         var3[0] = var4 - var6;
      } else {
         var3[0] = var4;
      }

      var2[0] = this.k5.l6;
      this.k5.l6 = var4;
      return false;
   }

   private boolean d9() {
      if (this.j5 == 0) {
         this.t2(
            this.p8
               ? "DTD is prohibited in this XML document."
               : "For security reasons DTD is prohibited in this XML document. To enable DTD processing set the DtdProcessing property on XmlReaderSettings to Parse and pass the settings into XmlReader.Create method."
         );
      }

      while (this.k5.k5 - this.k5.l6 < 8) {
         if (this.u8() == 0) {
            this.u3("Unexpected end of file while parsing {0} has occurred.", "DOCTYPE");
         }
      }

      if (!f4.n5(this.k5.n5, this.k5.l6, 7, "DOCTYPE")) {
         this.x8(!this.v8 && this.u6 == null ? "DOCTYPE" : "<!--");
      }

      if (!this.l6.n5(this.k5.n5[this.k5.l6 + 7])) {
         this.t4(this.k5.l6 + 7);
      }

      if (this.u6 != null) {
         this.n5(this.k5.l6 - 2, "Cannot have multiple DTDs.");
      }

      if (this.v8) {
         this.n5(this.k5.l6 - 2, "DTD must be defined before the document root element.");
      }

      this.k5.l6 += 8;
      this.a6((com.aspose.slides.internal.l7h.a5)null);
      if (this.j5 == 2) {
         this.c8.n5(this.k5.l6(), this.k5.k5());
         this.c5();
         this.a6 = this.u3;
         this.u3 = 9;
         return true;
      } else {
         this.t5();
         return false;
      }
   }

   private void c5() {
      v4 var1 = com.aspose.slides.ms.System.Xml.y2.n5();
      this.u6 = var1.n5(new b0$l6(this), true);
      if ((this.j8 || !this.p8) && (this.u6.k5() || this.u6.u3())) {
         this.w2 = true;
      }

      this.c8.n5(10, this.u6.n5().toString(), com.aspose.slides.ms.System.d1.n5, null);
      this.c8.n5(this.u6.l6());
   }

   private void t5() {
      int var1 = 0;
      int[] var2 = new int[]{0};
      int var3 = this.n5(var2);
      var1 = var2[0];
      this.k5.l6 = var3;
      this.a6((com.aspose.slides.internal.l7h.a5)null);
      if (this.k5.n5[this.k5.l6] != 'P') {
         if (this.k5.n5[this.k5.l6] != 'S') {
            if (this.k5.n5[this.k5.l6] != '[' && this.k5.n5[this.k5.l6] != '>') {
               this.c8("Expecting external ID, '[' or '>'.");
            }
         } else {
            while (this.k5.k5 - this.k5.l6 < 6) {
               if (this.u8() == 0) {
                  this.c8("Unexpected end of file has occurred.");
               }
            }

            if (!f4.n5(this.k5.n5, this.k5.l6, 6, "SYSTEM")) {
               this.x8("SYSTEM");
            }

            this.k5.l6 += 6;
            if (this.a6((com.aspose.slides.internal.l7h.a5)null) == 0) {
               this.t4(this.k5.l6);
            }

            this.j6();
            this.a6((com.aspose.slides.internal.l7h.a5)null);
         }
      } else {
         while (this.k5.k5 - this.k5.l6 < 6) {
            if (this.u8() == 0) {
               this.c8("Unexpected end of file has occurred.");
            }
         }

         if (!f4.n5(this.k5.n5, this.k5.l6, 6, "PUBLIC")) {
            this.x8("PUBLIC");
         }

         this.k5.l6 += 6;
         if (this.a6((com.aspose.slides.internal.l7h.a5)null) == 0) {
            this.t4(this.k5.l6);
         }

         this.j6();
         if (this.a6((com.aspose.slides.internal.l7h.a5)null) == 0) {
            this.t4(this.k5.l6);
         }

         this.j6();
         this.a6((com.aspose.slides.internal.l7h.a5)null);
      }

      if (this.k5.n5[this.k5.l6] == '[') {
         this.k5.l6++;
         this.n5(']', true);
         this.a6((com.aspose.slides.internal.l7h.a5)null);
         if (this.k5.n5[this.k5.l6] != '>') {
            this.x8(">");
         }
      } else if (this.k5.n5[this.k5.l6] == '>') {
         this.c8.n5(com.aspose.slides.ms.System.d1.n5);
      } else {
         this.c8("Expecting an internal subset or the end of the DOCTYPE declaration.");
      }

      this.k5.l6++;
   }

   private void j6() {
      char var1 = this.k5.n5[this.k5.l6];
      if (var1 != '"' && var1 != '\'') {
         this.u9("\"", "'");
      }

      this.k5.l6++;
      this.n5(var1, false);
   }

   private void n5(char var1, boolean var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      char var6 = '"';
      char[] var7 = this.k5.n5;
      int var8 = this.k5.l6;

      while (true) {
         char var9;
         while ((this.l6.n5[var9 = var7[var8]] & 255 & 128) == 0 || var7[var8] == var1 || var9 == '-' || var9 == '?') {
            if (var9 == var1 && !var3) {
               this.k5.l6 = var8 + 1;
               return;
            }

            label151: {
               label150: {
                  label149: {
                     label162: {
                        this.k5.l6 = var8;
                        switch (var9) {
                           case '\t':
                           case '&':
                           case '>':
                           case ']':
                              var8++;
                              continue;
                           case '\n':
                              this.e2(++var8);
                              continue;
                           case '\r':
                              if (var7[var8 + 1] == '\n') {
                                 var8 += 2;
                                 break label151;
                              }

                              if (var8 + 1 < this.k5.k5 || this.k5.z1) {
                                 var8++;
                                 break label151;
                              }
                              break;
                           case '"':
                           case '\'':
                              if (var3) {
                                 if (var6 == var9) {
                                    var3 = false;
                                 }
                              } else if (var2 && !var4 && !var5) {
                                 var3 = true;
                                 var6 = var9;
                              }

                              var8++;
                              continue;
                           case '-':
                              if (!var4) {
                                 break label149;
                              }

                              if (var8 + 2 < this.k5.k5 || this.k5.z1) {
                                 if (var7[var8 + 1] == '-' && var7[var8 + 2] == '>') {
                                    var4 = false;
                                    var8 += 2;
                                    continue;
                                 }
                                 break label149;
                              }
                              break;
                           case '<':
                              if (var7[var8 + 1] == '?') {
                                 if (var2 && !var3 && !var4) {
                                    var5 = true;
                                    var8 += 2;
                                    continue;
                                 }
                                 break label150;
                              }

                              if (var7[var8 + 1] == '!') {
                                 if (var8 + 3 < this.k5.k5 || this.k5.z1) {
                                    if (var7[var8 + 2] == '-' && var7[var8 + 3] == '-' && var2 && !var3 && !var5) {
                                       var4 = true;
                                       var8 += 4;
                                       continue;
                                    }
                                    break label150;
                                 }
                              } else if (var8 + 1 < this.k5.k5 || this.k5.z1) {
                                 break label150;
                              }
                              break;
                           case '?':
                              if (!var5) {
                                 break label162;
                              }

                              if (var8 + 1 < this.k5.k5 || this.k5.z1) {
                                 if (var7[var8 + 1] == '>') {
                                    var5 = false;
                                    var8++;
                                    continue;
                                 }
                                 break label162;
                              }
                              break;
                           default:
                              label111:
                              if (var8 != this.k5.k5) {
                                 char var10 = var7[var8];
                                 if (u4.n5((int)var10)) {
                                    if (var8 + 1 == this.k5.k5) {
                                       break label111;
                                    }

                                    if (u4.l6((int)var7[++var8])) {
                                       var8++;
                                       continue;
                                    }
                                 }

                                 this.l6(var7, this.k5.k5, var8);
                              }
                        }

                        if (this.u8() == 0) {
                           if (this.k5.k5 - this.k5.l6 > 0) {
                              if (this.k5.n5[this.k5.l6] != '\r') {
                                 this.c8("Unexpected end of file has occurred.");
                              }
                           } else {
                              this.c8("Unexpected end of file has occurred.");
                           }
                        }

                        var7 = this.k5.n5;
                        var8 = this.k5.l6;
                        continue;
                     }

                     var8++;
                     continue;
                  }

                  var8++;
                  continue;
               }

               var8++;
               continue;
            }

            this.e2(var8);
         }

         var8++;
      }
   }

   private int a6(com.aspose.slides.internal.l7h.a5 var1) {
      int var2 = this.k5.l6;
      int var3 = 0;
      char[] var4 = this.k5.n5;

      while (true) {
         label76:
         while (true) {
            switch (var4[var2]) {
               case '\t':
               case ' ':
                  var2++;
                  continue;
               case '\n':
                  this.e2(++var2);
                  continue;
               case '\r':
                  if (var4[var2 + 1] == '\n') {
                     int var7 = var2 - this.k5.l6;
                     if (var1 != null && !this.k5.m1) {
                        if (var7 > 0) {
                           var1.n5(var4, this.k5.l6, var7);
                           var3 += var7;
                        }

                        this.k5.l6 = var2 + 1;
                     }

                     var2 += 2;
                     break label76;
                  }

                  if (var2 + 1 >= this.k5.k5 && !this.k5.z1) {
                     break;
                  }

                  if (!this.k5.m1) {
                     var4[var2] = '\n';
                  }

                  var2++;
                  break label76;
               default:
                  if (var2 != this.k5.k5) {
                     int var5 = var2 - this.k5.l6;
                     if (var5 > 0) {
                        if (var1 != null) {
                           var1.n5(this.k5.n5, this.k5.l6, var5);
                        }

                        this.k5.l6 = var2;
                        var3 += var5;
                     }

                     return var3;
                  }
            }

            int var6 = var2 - this.k5.l6;
            if (var6 > 0) {
               if (var1 != null) {
                  var1.n5(this.k5.n5, this.k5.l6, var6);
               }

               this.k5.l6 = var2;
               var3 += var6;
            }

            if (this.u8() == 0) {
               if (this.k5.k5 - this.k5.l6 == 0) {
                  return var3;
               }

               if (this.k5.n5[this.k5.l6] != '\r') {
                  this.c8("Unexpected end of file has occurred.");
               }
            }

            var2 = this.k5.l6;
            var4 = this.k5.n5;
         }

         this.e2(var2);
      }
   }

   private int l6(int var1, int[] var2, int[] var3) {
      if (this.k5.n5[var1 + 1] == '#') {
         return this.n5(var1, true, null, var2, var3);
      }

      var2[0] = 1;
      var3[0] = 2;
      return this.n5(var1, true, null);
   }

   private int n5(boolean var1, com.aspose.slides.internal.l7h.a5 var2, int[] var3) {
      while (true) {
         int var4 = 0;
         int[] var5 = new int[]{0};
         int var6;
         int var7 = var6 = this.n5(this.k5.l6, var1, var2, var5, var3);
         var4 = var5[0];
         switch (var7) {
            case -2:
               if (this.u8() == 0) {
                  this.c8("Unexpected end of file while parsing {0} has occurred.");
               }
               break;
            default:
               if (var1) {
                  this.k5.l6 = var6 - var4;
               }

               return var6;
         }
      }
   }

   private int n5(int var1, boolean var2, com.aspose.slides.internal.l7h.a5 var3, int[] var4, int[] var5) {
      int var6 = 0;
      String var7 = null;
      char[] var8 = this.k5.n5;
      int var9 = var1 + 2;
      var4[0] = 0;
      int var10 = 0;

      try {
         if (var8[var9] == 'x') {
            var10 = ++var9;
            var7 = "Invalid syntax for a hexadecimal numeric entity reference.";

            while (true) {
               char var11 = var8[var9];
               if (var11 >= '0' && var11 <= '9') {
                  var6 = var6 * 16 + var11 - 48;
               } else if (var11 >= 'a' && var11 <= 'f') {
                  var6 = var6 * 16 + 10 + var11 - 97;
               } else {
                  if (var11 < 'A' || var11 > 'F') {
                     var5[0] = 1;
                     break;
                  }

                  var6 = var6 * 16 + 10 + var11 - 65;
               }

               var9++;
            }
         } else {
            if (var9 >= this.k5.k5) {
               var5[0] = 4;
               return -2;
            }

            var10 = var9;
            var7 = "Invalid syntax for a decimal numeric entity reference.";

            while (var8[var9] >= '0' && var8[var9] <= '9') {
               var6 = var6 * 10 + var8[var9] - 48;
               var9++;
            }

            var5[0] = 0;
         }
      } catch (OverflowException var15) {
         this.k5.l6 = var9;
         var5[0] = 4;
         this.n5("Invalid value of a character entity reference.", (String)null, var15);
      }

      if (var8[var9] != ';' || var10 == var9) {
         if (var9 == this.k5.k5) {
            return -2;
         }

         this.n5(var9, var7);
      }

      if (var6 <= 65535) {
         char var18 = (char)var6;
         if (!this.l6.a6(var18) && (this.p8 && this.k7 || !this.p8 && this.y2)) {
            this.n5(
               this.k5.n5[var1 + 2] == 'x' ? var1 + 3 : var1 + 2,
               "'{0}', hexadecimal value {1}, is an invalid character.",
               XmlException.buildCharExceptionArgs(var18, '\u0000')
            );
         }

         if (var2) {
            if (var3 != null) {
               var3.n5(this.k5.n5, this.k5.l6, var9 - this.k5.l6 + 1);
            }

            var8[var9] = var18;
         }

         var4[0] = 1;
         return var9 + 1;
      } else {
         char var16 = '\u0000';
         char var12 = '\u0000';
         char[] var13 = new char[]{'\u0000'};
         char[] var14 = new char[]{'\u0000'};
         u4.n5(var6, var13, var14);
         var16 = var13[0];
         var12 = var14[0];
         if (this.k7 && (!u4.n5((int)var12) || !u4.l6((int)var16))) {
            this.n5(
               this.k5.n5[var1 + 2] == 'x' ? var1 + 3 : var1 + 2,
               "'{0}', hexadecimal value {1}, is an invalid character.",
               XmlException.buildCharExceptionArgs(var12, var16)
            );
         }

         if (var2) {
            if (var3 != null) {
               var3.n5(this.k5.n5, this.k5.l6, var9 - this.k5.l6 + 1);
            }

            var8[var9 - 1] = var12;
            var8[var9] = var16;
         }

         var4[0] = 2;
         return var9 + 1;
      }
   }

   private int l6(boolean var1, com.aspose.slides.internal.l7h.a5 var2) {
      while (true) {
         int var3;
         switch (var3 = this.n5(this.k5.l6, var1, var2)) {
            case -2:
               if (this.u8() != 0) {
                  break;
               }

               return -1;
            case -1:
               return -1;
            default:
               if (var1) {
                  this.k5.l6 = var3 - 1;
               }

               return var3;
         }
      }
   }

   private int n5(int var1, boolean var2, com.aspose.slides.internal.l7h.a5 var3) {
      int var4 = var1 + 1;
      char[] var5 = this.k5.n5;
      byte var6;
      switch (var5[var4]) {
         case 'a':
            if (var5[++var4] == 'm') {
               if (this.k5.k5 - var4 < 3) {
                  return -2;
               }

               if (var5[var4 + 1] != 'p' || var5[var4 + 2] != ';') {
                  return -1;
               }

               var4 += 3;
               var6 = 38;
            } else {
               if (var5[var4] != 'p') {
                  if (var4 < this.k5.k5) {
                     return -1;
                  }

                  return -2;
               }

               if (this.k5.k5 - var4 < 4) {
                  return -2;
               }

               if (var5[var4 + 1] != 'o' || var5[var4 + 2] != 's' || var5[var4 + 3] != ';') {
                  return -1;
               }

               var4 += 4;
               var6 = 39;
            }
            break;
         case 'g':
            if (this.k5.k5 - var4 < 3) {
               return -2;
            }

            if (var5[var4 + 1] != 't' || var5[var4 + 2] != ';') {
               return -1;
            }

            var4 += 3;
            var6 = 62;
            break;
         case 'l':
            if (this.k5.k5 - var4 < 3) {
               return -2;
            }

            if (var5[var4 + 1] != 't' || var5[var4 + 2] != ';') {
               return -1;
            }

            var4 += 3;
            var6 = 60;
            break;
         case 'q':
            if (this.k5.k5 - var4 < 5) {
               return -2;
            }

            if (var5[var4 + 1] != 'u' || var5[var4 + 2] != 'o' || var5[var4 + 3] != 't' || var5[var4 + 4] != ';') {
               return -1;
            }

            var4 += 5;
            var6 = 34;
            break;
         default:
            return -1;
      }

      if (var2) {
         if (var3 != null) {
            var3.n5(this.k5.n5, this.k5.l6, var4 - this.k5.l6);
         }

         this.k5.n5[var4 - 1] = (char)var6;
      }

      return var4;
   }

   private int w9() {
      int var1 = 0;
      int[] var2 = new int[]{0};
      int var3 = this.l6(false, 0, var2);
      var1 = var2[0];
      return var3;
   }

   private int n5(int[] var1) {
      return this.l6(true, 0, var1);
   }

   private int l6(boolean var1, int var2, int[] var3) {
      int var4 = -1;
      int var5 = this.k5.l6 + var2;

      label64:
      while (true) {
         char[] var6;
         while (true) {
            var6 = this.k5.n5;
            if ((this.l6.n5[var6[var5]] & 255 & 4) != 0) {
               var5++;
               break;
            }

            if (var5 + 1 >= this.k5.k5) {
               int[] var7 = new int[]{var5};
               boolean var8 = this.l6(var7);
               var5 = var7[0];
               if (var8) {
                  continue;
               }

               this.n5(var5, "Unexpected end of file while parsing {0} has occurred.", "Name");
            }

            if (var6[var5] != ':' || this.m3) {
               this.n5(var5, "Name cannot begin with the '{0}' character, hexadecimal value {1}.", XmlException.buildCharExceptionArgs(var6, this.k5.k5, var5));
            }
            break;
         }

         while (true) {
            while ((this.l6.n5[var6[var5]] & 255 & 8) == 0) {
               if (var6[var5] == ':') {
                  if (this.m3) {
                     if (var4 != -1 || !var1) {
                        this.n5(
                           var5,
                           "The '{0}' character, hexadecimal value {1}, cannot be included in a name.",
                           XmlException.buildCharExceptionArgs(':', '\u0000')
                        );
                     }

                     var4 = var5 - this.k5.l6;
                     var5++;
                     continue label64;
                  }

                  var4 = var5 - this.k5.l6;
                  var5++;
               } else {
                  if (var5 != this.k5.k5) {
                     break label64;
                  }

                  int[] var9 = new int[]{var5};
                  boolean var10 = this.l6(var9);
                  var5 = var9[0];
                  if (!var10) {
                     this.n5(var5, "Unexpected end of file while parsing {0} has occurred.", "Name");
                     break label64;
                  }

                  var6 = this.k5.n5;
               }
            }

            var5++;
         }
      }

      var3[0] = var4 == -1 ? -1 : this.k5.l6 + var4;
      return var5;
   }

   private boolean l6(int[] var1) {
      int var2 = var1[0] - this.k5.l6;
      boolean var3 = this.u8() != 0;
      var1[0] = this.k5.l6 + var2;
      return var3;
   }

   private String m8() {
      int var1;
      try {
         var1 = this.w9();
      } catch (XmlException var3) {
         this.c8("An error occurred while parsing EntityName.");
         return null;
      }

      if (this.k5.n5[var1] != ';') {
         this.c8("An error occurred while parsing EntityName.");
      }

      String var2 = this.t4.n5(this.k5.n5, this.k5.l6, var1 - this.k5.l6);
      this.k5.l6 = var1 + 1;
      return var2;
   }

   private b0$a6 n5(int var1, int var2) {
      b0$a6 var3 = this.h0[var1];
      if (var3 != null) {
         var3.t2 = var2;
         return var3;
      } else {
         return this.l6(var1, var2);
      }
   }

   private b0$a6 l6(int var1, int var2) {
      if (var1 >= this.h0.length - 1) {
         b0$a6[] var3 = new b0$a6[this.h0.length * 2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.h0)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, this.h0.length);
         this.h0 = var3;
      }

      b0$a6 var4 = this.h0[var1];
      if (var4 == null) {
         var4 = new b0$a6();
         this.h0[var1] = var4;
      }

      var4.t2 = var2;
      return var4;
   }

   private b0$a6 n5(String var1, int var2) {
      b0$a6 var3 = this.n5(this.t2 + this.x8 + 1, var2);
      var3.l6(2, this.t4.n5(var1));
      this.x8++;
      return var3;
   }

   private b0$a6 k5(int var1, int var2) {
      if (var2 != -1 && this.m3) {
         this.e2 = true;
         int var6 = this.k5.l6;
         int var4 = var2 - var6;
         if (var4 == this.i1.length() && f4.n5(this.k5.n5, var6, var4, this.i1)) {
            return this.n5(this.t4.n5(this.k5.n5, var2 + 1, var1 - var2 - 1), this.i1, (String)null);
         }

         String var5 = this.t4.n5(this.k5.n5, var6, var4);
         this.i1 = var5;
         return this.n5(this.t4.n5(this.k5.n5, var2 + 1, var1 - var2 - 1), var5, (String)null);
      } else {
         String var3 = this.t4.n5(this.k5.n5, this.k5.l6, var1 - this.k5.l6);
         return this.n5(var3, com.aspose.slides.ms.System.d1.n5, var3);
      }
   }

   private b0$a6 n5(String var1, String var2, String var3) {
      b0$a6 var4 = this.n5(this.t2 + this.x8 + 1, this.t2 + 1);
      var4.n5(2, var1, var2, var3);
      int var5 = 1 << (var1.charAt(0) & 31);
      if ((this.n3 & var5) == 0) {
         this.n3 |= var5;
      } else if (this.y4 < 250) {
         this.y4++;

         for (int var6 = this.t2 + 1; var6 < this.t2 + this.x8 + 1; var6++) {
            b0$a6 var7 = this.h0[var6];
            if (com.aspose.slides.ms.System.Xml.v8.n5(var7.l6, var4.l6)) {
               this.y4 = 250;
               break;
            }
         }
      }

      this.x8++;
      return var4;
   }

   private void b9() {
      this.f2.u3();
      if (this.c8.x8) {
         this.n9();
      }
   }

   private void e2(int var1) {
      this.k5.n3++;
      this.k5.y4 = var1 - 1;
   }

   private void r6() {
      this.c8 = this.h0[0];
      this.c8.n5(0);
      this.c8.n5(this.k5.l6(), this.k5.k5());
      this.u3 = 11;
      this.i9 = 3;
      this.v4 = null;
   }

   private String a6(b0$a6 var1) {
      String var2 = this.f2.n5(var1.k5);
      if (var2 != null) {
         return var2;
      }

      this.n5("'{0}' is an undeclared prefix.", var1.k5, var1.l6(), var1.k5());
      return null;
   }

   private void n5(String var1, String var2, b0$a6 var3) {
      if ("http://www.w3.org/2000/xmlns/".equals(var2)) {
         if (com.aspose.slides.ms.System.Xml.v8.n5(var1, this.a7)) {
            this.n5("Prefix \"xmlns\" is reserved for use by XML.", var3.h0.n5, var3.h0.l6);
         } else {
            this.n5("Prefix '{0}' cannot be mapped to namespace name reserved for \"xml\" or \"xmlns\".", var1, var3.h0.n5, var3.h0.l6);
         }
      } else if ("http://www.w3.org/XML/1998/namespace".equals(var2) && !com.aspose.slides.ms.System.Xml.v8.n5(var1, this.i6) && !this.p8) {
         this.n5("Prefix '{0}' cannot be mapped to namespace name reserved for \"xml\" or \"xmlns\".", var1, var3.h0.n5, var3.h0.l6);
      }

      if (var2.length() == 0 && var1.length() > 0) {
         this.n5("Invalid namespace declaration.", var3.u9.n5, var3.u9.l6);
      }

      try {
         this.f2.n5(var1, var2);
      } catch (ArgumentException var5) {
         this.n5(var5, var3.u9.n5, var3.u9.l6);
      }
   }

   private void r5() {
      if (this.t9) {
         this.h9();
      }

      this.s7 = -1;
      this.x8 = 0;
      this.n3 = 0;
      this.y4 = 0;
   }

   private void h9() {
      for (int var1 = this.t2 + 1; var1 < this.t2 + this.x8 + 1; var1++) {
         b0$a6 var2 = this.h0[var1];
         var2.n3 = null;
         var2.l6(false);
      }

      this.t9 = false;
   }

   private void r7() {
      this.e5 = new b0$c8(this.e5);
      this.c8.x8 = true;
   }

   private void n9() {
      this.e5 = this.e5.u3;
      this.c8.x8 = false;
   }

   private int a2() {
      if (this.z8 != 2) {
         if (this.e5.n5 == 2) {
            return 14;
         }

         if (this.z8 == 0) {
            return 13;
         }
      }

      return 0;
   }

   private int t9(int var1) {
      return var1 > 32 ? 3 : this.a2();
   }

   private void n5(String var1, String var2, com.aspose.slides.ms.System.r8 var3, String var4) {
      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         try {
            com.aspose.slides.ms.System.r8 var5 = this.z3.n5(var3, var1);
            if (this.n5(var5)) {
               return;
            }
         } catch (RuntimeException var8) {
         }
      }

      com.aspose.slides.ms.System.r8 var10 = this.z3.n5(var3, var2);

      try {
         if (this.n5(var10)) {
            return;
         }
      } catch (RuntimeException var9) {
         if (this.p8) {
            throw var9;
         }

         String var7 = var9.getMessage();
         this.l6(
            new XmlException(
               var4 == null ? "An error has occurred while opening external DTD '{0}': {1}" : "An error has occurred while opening external entity '{0}': {1}",
               new String[]{var10.toString(), var7},
               var9,
               0,
               0
            )
         );
      }

      if (var4 == null) {
         this.l6(
            "Cannot resolve external DTD subset - public ID = '{0}', system ID = '{1}'.",
            new String[]{var1 != null ? var1 : com.aspose.slides.ms.System.d1.n5, var2},
            null
         );
      } else {
         this.u3(
            this.j5 == 1
               ? "Cannot resolve entity reference '{0}' because the DTD has been ignored. To enable DTD processing set the DtdProcessing property on XmlReaderSettings to Parse and pass the settings into XmlReader.Create method."
               : "Cannot resolve entity reference '{0}'.",
            var4
         );
      }
   }

   private boolean n5(com.aspose.slides.ms.System.r8 var1) {
      if (this.z3.n5(var1, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.y1.class))) {
         com.aspose.slides.internal.z0k.y1 var2 = (com.aspose.slides.internal.z0k.y1)this.z3
            .n5(var1, null, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.y1.class));
         if (var2 == null) {
            return false;
         }

         this.v6();
         this.n5(var1.toString(), var1, var2);
      } else {
         com.aspose.slides.internal.z0k.t4 var3 = (com.aspose.slides.internal.z0k.t4)this.z3
            .n5(var1, null, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class));
         if (var3 == null) {
            return false;
         }

         this.v6();
         this.n5(var1, var3, null);
      }

      return true;
   }

   private boolean n5(o0 var1) {
      if (!this.y8()) {
         com.aspose.slides.ms.System.r8 var4 = null;
         if (!com.aspose.slides.ms.System.d1.n5(var1.u9())) {
            var4 = this.z3.n5(null, var1.u9());
         }

         this.n5(var1.t2(), var1.c8(), var4, var1.n5());
         this.k5(var1);
         int var3 = this.k5.l6;
         if (this.p8) {
            this.a6((com.aspose.slides.internal.l7h.a5)null);
         }

         if (!this.h0(true)) {
            this.k5.l6 = var3;
         }

         return true;
      } else {
         com.aspose.slides.internal.l7h.j5 var2 = this.k5.u3;
         this.v6();
         this.n5(var1.c8(), var2, com.aspose.slides.ms.System.d1.n5);
         this.k5(var1);
         this.n5(0L, true);
         return false;
      }
   }

   private void l6(o0 var1) {
      com.aspose.slides.internal.l7h.j5 var2 = this.k5.u3;
      this.v6();
      String var3 = var1.s7();
      if (var3 == null) {
         var3 = com.aspose.slides.ms.System.d1.n5;
      }

      this.n5(var1.h0() != null ? var1.h0() : com.aspose.slides.ms.System.d1.n5, var2, var3);
      this.k5(var1);
      this.k5.n3 = var1.x8();
      this.k5.y4 = -var1.n3() - 1;
      this.k5.m1 = true;
      this.n5(var1.s7().length(), true);
   }

   private void h1() {
      if (this.k5.u9 != null) {
         this.k5.u9.close();
      }

      this.t6();
      this.x0();
      this.c8.s7 = this.k5.z3;
   }

   private void k5(o0 var1) {
      if (this.h6 != null && this.h6.containsKey(var1)) {
         this.n5(
            var1.a6() ? "Parameter entity '{0}' references itself." : "General entity '{0}' references itself.",
            var1.n5(),
            this.b3[this.o0].l6(),
            this.b3[this.o0].k5()
         );
      }

      this.k5.q0 = var1;
      this.k5.z3 = this.g7++;
      if (var1 != null) {
         if (this.h6 == null) {
            this.h6 = new Dictionary<>();
         }

         this.h6.addItem(var1, var1);
      }
   }

   private void t6() {
      if (this.k5.q0 != null) {
         this.h6.removeItemByKey(this.k5.q0);
      }
   }

   private void v6() {
      if (this.b3 == null) {
         this.b3 = (b0$h0[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(b0$h0.class), 2));
      } else if (this.o0 + 1 == this.b3.length) {
         b0$h0[] var1 = (b0$h0[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(b0$h0.class), this.b3.length * 2)
         );
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.b3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, this.b3.length);
         this.b3 = var1;
      }

      this.o0++;
      this.k5.n5(this.b3[this.o0]);
      this.k5.n5();
   }

   private void x0() {
      this.k5.n5(true);
      this.b3[this.o0--].n5(this.k5);
   }

   private int o2() {
      int var1 = 0;

      label222:
      while (true) {
         int var2 = this.y0 - this.x9;
         if (var2 > 0) {
            int var3;
            try {
               var3 = this.v0.n5(this.k5.n5, this.x9, var2);
            } catch (XmlException var11) {
               this.n5(var11, this.a3.n5, this.a3.l6);
               return 0;
            }

            if (var3 < var2) {
               this.x9 += var3;
               this.a3.l6 += var3;
               return var3;
            }

            this.x9 = 0;
            this.y0 = 0;
            this.a3.l6 += var3;
            if (this.v0.n5()) {
               return var3;
            }
         }

         int var12 = 0;
         int var4 = 0;

         while (true) {
            switch (this.f0) {
               case 2:
                  int[] var16 = new int[]{var12};
                  int[] var21 = new int[]{var4};
                  boolean var28 = this.l6(var16, var21);
                  var12 = var16[0];
                  var4 = var21[0];
                  if (var28) {
                     this.k5.l6 -= 2;
                     this.f0 = 0;
                  }
                  break;
               case 3:
                  int[] var15 = new int[]{var12};
                  int[] var20 = new int[]{var4};
                  boolean var27 = this.n5(4, var15, var20);
                  var12 = var15[0];
                  var4 = var20[0];
                  if (var27) {
                     this.k5.l6 -= 3;
                     this.f0 = 0;
                  }
                  break;
               case 4:
                  int[] var14 = new int[]{var12};
                  int[] var19 = new int[]{var4};
                  boolean var26 = this.n5(8, var14, var19);
                  var12 = var14[0];
                  var4 = var19[0];
                  if (var26) {
                     this.k5.l6 -= 3;
                     this.f0 = 0;
                  }
                  break;
               case 7:
                  if (this.u8() == 0) {
                     this.u5();
                  }

                  this.f0 = 0;
                  var12 = this.k5.l6;
               case 0:
               case 1:
               case 5:
               case 6:
               default:
                  char[] var5 = this.k5.n5;
                  var12 = this.k5.l6;
                  var4 = var12;

                  label215:
                  while (true) {
                     this.a3.n5(this.k5.l6(), this.k5.k5());
                     char var6;
                     if (this.f0 == 5) {
                        while ((this.l6.n5[var6 = var5[var4]] & 255 & 128) != 0 && var6 != '/') {
                           var4++;
                        }
                     } else {
                        while ((this.l6.n5[var6 = var5[var4]] & 255 & 128) != 0) {
                           var4++;
                        }
                     }

                     if (var5[var4] != '&' && var5[var4] != '\t') {
                        if (var4 - var12 > 0) {
                           break;
                        }

                        label211: {
                           label210: {
                              label208:
                              switch (var5[var4]) {
                                 case '\n':
                                    this.e2(++var4);
                                    continue;
                                 case '\r':
                                    if (var5[var4 + 1] == '\n') {
                                       var4 += 2;
                                       break label211;
                                    }

                                    if (var4 + 1 < this.k5.k5) {
                                       var4++;
                                       break label211;
                                    }
                                    break;
                                 case '"':
                                 case '\'':
                                    switch (this.f0) {
                                       case 5:
                                          this.c8.c8 = var5[var4];
                                          this.f0 = 6;
                                          break;
                                       case 6:
                                          if (var5[var4] == this.c8.c8) {
                                             this.f0 = 5;
                                          }
                                    }

                                    var4++;
                                    continue;
                                 case '/':
                                    if (this.f0 != 5) {
                                       break label210;
                                    }

                                    if (this.k5.k5 - var4 >= 2) {
                                       if (var5[var4 + 1] == '>') {
                                          this.f0 = 0;
                                          this.p3--;
                                       }
                                       break label210;
                                    }
                                    break;
                                 case '<':
                                    if (this.f0 != 0) {
                                       var4++;
                                       continue;
                                    }

                                    if (this.k5.k5 - var4 >= 2) {
                                       switch (var5[var4 + 1]) {
                                          case '!':
                                             if (this.k5.k5 - var4 >= 4) {
                                                if (var5[var4 + 2] == '-' && var5[var4 + 3] == '-') {
                                                   var4 += 4;
                                                   this.f0 = 4;
                                                   break label215;
                                                }

                                                if (this.k5.k5 - var4 >= 9) {
                                                   if (f4.n5(var5, var4 + 2, 7, "[CDATA[")) {
                                                      var4 += 9;
                                                      this.f0 = 3;
                                                      break label215;
                                                   }
                                                   continue;
                                                }
                                             }
                                             break label208;
                                          case '/':
                                             int var24 = 0;
                                             int[] var29 = new int[]{0};
                                             int var30 = this.l6(true, 2, var29);
                                             var24 = var29[0];
                                             if (f4.n5(var5, this.k5.l6 + 2, var30 - this.k5.l6 - 2, this.c8.n5(this.t4))
                                                && (this.k5.n5[var30] == '>' || this.l6.n5(this.k5.n5[var30]))) {
                                                if (--this.p3 <= 0) {
                                                   this.k5.l6 = var30;
                                                   if (this.l6.n5(this.k5.n5[var30])) {
                                                      this.a6((com.aspose.slides.internal.l7h.a5)null);
                                                   }

                                                   if (this.k5.n5[this.k5.l6] != '>') {
                                                      this.x8(">");
                                                   }

                                                   this.k5.l6++;
                                                   this.f0 = 8;
                                                   continue label222;
                                                }

                                                var4 = var30 + 1;
                                                continue;
                                             }

                                             var4 = var30;
                                             var12 = this.k5.l6;
                                             var5 = this.k5.n5;
                                             continue;
                                          case '?':
                                             var4 += 2;
                                             this.f0 = 2;
                                             break label215;
                                          default:
                                             int var7 = 0;
                                             int[] var8 = new int[]{0};
                                             int var9 = this.l6(true, 1, var8);
                                             var7 = var8[0];
                                             if (!f4.n5(this.k5.n5, this.k5.l6 + 1, var9 - this.k5.l6 - 1, this.c8.l6)
                                                || this.k5.n5[var9] != '>' && this.k5.n5[var9] != '/' && !this.l6.n5(this.k5.n5[var9])) {
                                                var4 = var9;
                                                var12 = this.k5.l6;
                                                var5 = this.k5.n5;
                                                continue;
                                             }

                                             this.p3++;
                                             this.f0 = 5;
                                             var4 = var9;
                                             break label215;
                                       }
                                    }
                                    break;
                                 case '>':
                                    if (this.f0 == 5) {
                                       this.f0 = 0;
                                    }

                                    var4++;
                                    continue;
                                 default:
                                    if (var4 != this.k5.k5) {
                                       var4++;
                                       continue;
                                    }
                              }

                              this.f0 = 7;
                              break;
                           }

                           var4++;
                           continue;
                        }

                        this.e2(var4);
                     } else {
                        var4++;
                     }
                  }

                  this.k5.l6 = var4;
                  break;
               case 8:
                  this.u3 = 7;
                  this.a6 = this.t2 <= 0 && this.t1 == 9 ? 5 : 0;
                  this.c3.u9();
                  this.f0 = 9;
                  return var1;
               case 9:
                  return var1;
            }

            int var17 = var4 - var12;
            if (var17 > 0) {
               int var22;
               try {
                  var22 = this.v0.n5(this.k5.n5, var12, var17);
               } catch (XmlException var10) {
                  this.n5(var10, this.a3.n5, this.a3.l6);
                  return 0;
               }

               var1 += var22;
               if (this.v0.n5()) {
                  this.x9 = var12 + var22;
                  this.y0 = var4;
                  this.a3.l6 += var22;
                  return var1;
               }
            }
         }
      }
   }

   private void e0() {
      this.v0 = new x9();
      this.o2();
      this.v0 = null;
   }

   private boolean i2() {
      if (this.c8.n5 == 0) {
         this.c8.n5 = 2;
         this.s7 = 0;
         this.n5(this.k5.l6, ' ', this.c8);
      } else {
         this.u3 = 22;
      }

      if (this.c8()) {
         this.u3 = 15;
         return true;
      } else {
         this.r6();
         return false;
      }
   }

   private boolean x7() {
      char[] var1 = this.k5.n5;
      int var2 = this.k5.l6;
      this.c8 = this.n5(this.t2 + this.x8 + 1, this.t2 + 2);
      this.c8.n5(this.k5.l6(), this.k5.k5());
      if (this.z6) {
         this.c8.n5(3, com.aspose.slides.ms.System.d1.n5);
         this.z6 = false;
         return true;
      }

      while (true) {
         while ((this.l6.n5[var1[var2]] & 255 & 128) == 0) {
            switch (var1[var2]) {
               case '\t':
               case '\n':
                  if (this.k7) {
                     var1[var2] = ' ';
                  }

                  var2++;
                  continue;
               case '\r':
                  var2++;
                  continue;
               case '"':
               case '\'':
               case '>':
                  var2++;
                  continue;
               case '&':
                  if (var2 - this.k5.l6 > 0) {
                     this.s0.n5(var1, this.k5.l6, var2 - this.k5.l6);
                  }

                  this.k5.l6 = var2;
                  int[] var6 = new int[]{var2};
                  int var4 = this.n5(true, 2, var6);
                  var2 = var6[0];
                  switch (var4) {
                     case 0:
                     case 1:
                     case 2:
                        var1 = this.k5.n5;
                        if (this.k7 && this.l6.n5(var1[this.k5.l6]) && var2 - this.k5.l6 == 1) {
                           var1[this.k5.l6] = ' ';
                        }
                     case 3:
                     case 4:
                     case 5:
                     default:
                        var1 = this.k5.n5;
                        continue;
                     case 6:
                        if (this.s0.l6() == 0) {
                           this.c8.u9.l6++;
                           this.k5.l6++;
                           this.c8.l6(5, this.m8());
                           return true;
                        }

                        if (var2 - this.k5.l6 > 0) {
                           this.s0.n5(var1, this.k5.l6, var2 - this.k5.l6);
                           this.k5.l6 = var2;
                        }

                        this.c8.n5(3, this.s0.toString());
                        this.s0.n5(0);
                        return true;
                  }
               case '<':
                  this.n5(var2, "'{0}', hexadecimal value {1}, is an invalid attribute character.", XmlException.buildCharExceptionArgs('<', '\u0000'));
                  break;
               default:
                  label76:
                  if (var2 != this.k5.k5) {
                     char var3 = var1[var2];
                     if (u4.n5((int)var3)) {
                        if (var2 + 1 == this.k5.k5) {
                           break label76;
                        }

                        if (u4.l6((int)var1[++var2])) {
                           var2++;
                           continue;
                        }
                     }

                     this.l6(var1, this.k5.k5, var2);
                  }
            }

            if (var2 - this.k5.l6 > 0) {
               this.s0.n5(var1, this.k5.l6, var2 - this.k5.l6);
               this.k5.l6 = var2;
            }

            if (this.u8() == 0) {
               if (this.s0.l6() > 0) {
                  if (var2 - this.k5.l6 > 0) {
                     this.s0.n5(var1, this.k5.l6, var2 - this.k5.l6);
                     this.k5.l6 = var2;
                  }

                  this.c8.n5(3, this.s0.toString());
                  this.s0.n5(0);
                  return true;
               }

               if (this.c8(false)) {
                  this.y6();
                  return true;
               }
            }

            var2 = this.k5.l6;
            var1 = this.k5.n5;
         }

         var2++;
      }
   }

   private void z0() {
      try {
         this.h0(false);
      } catch (XmlException var2) {
         this.n5(var2, var2.getLineNumber(), var2.getLinePosition() - 6);
      }
   }

   private void l6(int var1, String var2) {
      this.l6(var1, var2, null);
   }

   private void x8(String var1) {
      this.u9(var1, null);
   }

   private void l6(int var1, String var2, String var3) {
      this.k5.l6 = var1;
      this.u9(var2, var3);
   }

   private void u9(String var1, String var2) {
      String var3 = this.z9();
      if (var3 == null) {
         this.c8("Unexpected end of file has occurred.");
      }

      if (var2 != null) {
         this.n5("'{0}' is an unexpected token. The expected token is '{1}' or '{2}'.", new String[]{var3, var1, var2});
      } else {
         this.n5("'{0}' is an unexpected token. The expected token is '{1}'.", new String[]{var3, var1});
      }
   }

   private String z1(int var1) {
      this.k5.l6 = var1;
      return this.z9();
   }

   private String z9() {
      if (this.k5.l6 == this.k5.k5) {
         return null;
      }

      if (!this.l6.l6(this.k5.n5[this.k5.l6])) {
         return com.aspose.slides.ms.System.d1.n5(this.k5.n5, this.k5.l6, 1);
      }

      int var1 = this.k5.l6 + 1;

      while (this.l6.l6(this.k5.n5[var1])) {
         var1++;
      }

      return com.aspose.slides.ms.System.d1.n5(this.k5.n5, this.k5.l6, var1 - this.k5.l6);
   }

   private void t4(int var1) {
      String var2 = this.z1(var1);
      if (var2 == null) {
         this.n5(var1, "Unexpected end of file has occurred.");
      } else {
         this.n5(var1, "'{0}' is an unexpected token. Expecting white space.", var2);
      }
   }

   private int n3(String var1) {
      var1 = this.t4.l6(var1);
      if (var1 == null) {
         return -1;
      }

      for (int var2 = this.t2 + 1; var2 < this.t2 + this.x8 + 1; var2++) {
         if (com.aspose.slides.ms.System.Xml.v8.n5(this.h0[var2].l6, var1) && this.h0[var2].k5.length() == 0) {
            return var2;
         }
      }

      return -1;
   }

   private int y4(String var1) {
      var1 = this.t4.n5(var1);
      if (var1 == null) {
         return -1;
      }

      for (int var2 = this.t2 + 1; var2 < this.t2 + this.x8 + 1; var2++) {
         if (com.aspose.slides.ms.System.Xml.v8.n5(this.h0[var2].n5(this.t4), var1)) {
            return var2;
         }
      }

      return -1;
   }

   private boolean q0(int var1) {
      if (this.p8 && var1 == this.k5.k5 - 1 && this.k5.n5[var1] == 0 && this.u8() == 0 && this.k5.t4) {
         this.k5.k5--;
         return true;
      } else {
         return false;
      }
   }

   private void f8() {
      v4 var1 = com.aspose.slides.ms.System.Xml.y2.n5();
      this.u6 = var1.n5(this.a5.u9(), this.a5.k5(), this.a5.u3(), this.a5.a6(), this.a5.h0(), new b0$l6(this));
      if ((this.j8 || !this.p8) && (this.u6.k5() || this.u6.u3())) {
         this.w2 = true;
      }
   }

   private boolean t2(boolean var1) {
      do {
         switch (this.c8.n5) {
            case 2:
               return !var1;
            case 3:
            case 4:
            case 13:
            case 14:
               if (!var1) {
                  return true;
               }
               break;
            case 5:
               this.c3.a0();
               break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            default:
               return false;
            case 7:
            case 8:
            case 16:
         }

         var1 = false;
      } while (this.c3.u9());

      return false;
   }

   private void n5(b1 var1, w4 var2) {
      z9 var3 = var2.n5();
      this.q0 = var3 != null;
      if (var1.l6() != null) {
         if (var3 != null && var3 != var1.l6().n5()) {
            throw new XmlException(
               "XmlReaderSettings.XmlNameTable must be the same name table as in XmlParserContext.NameTable or XmlParserContext.NamespaceManager.NameTable, or it must be null."
            );
         }

         this.f2 = var1.l6();
         this.e5.k5 = this.f2.n5(com.aspose.slides.ms.System.d1.n5);
         var3 = this.f2.n5();
      } else if (var1.n5() != null) {
         if (var3 != null && var3 != var1.n5()) {
            throw new XmlException(
               "XmlReaderSettings.XmlNameTable must be the same name table as in XmlParserContext.NameTable or XmlParserContext.NamespaceManager.NameTable, or it must be null.",
               com.aspose.slides.ms.System.d1.n5
            );
         }

         var3 = var1.n5();
      } else if (var3 == null) {
         var3 = new j9();
      }

      this.t4 = var3;
      if (this.f2 == null) {
         this.f2 = new s2(var3);
      }

      this.e5.n5 = var1.t2();
      this.e5.l6 = var1.c8();
   }

   @Override
   public z7 d2() {
      return this.u6;
   }

   public final void n5(z7 var1) {
      this.u6 = var1;
      if (this.u6 != null && (this.j8 || !this.p8) && (this.u6.k5() || this.u6.u3())) {
         this.w2 = true;
      }
   }

   public final void n5(v0 var1) {
      this.e9 = var1;
   }

   public final void n5(b0$u9 var1) {
      this.o5 = var1;
   }

   public final void a6(boolean var1) {
      this.j8 = var1;
      if (var1) {
         this.t4.n5("http://www.w3.org/2001/XMLSchema");
         this.t4.n5("http://www.w3.org/2001/XMLSchema-instance");
         this.t4.n5("urn:schemas-microsoft-com:datatypes");
      }
   }

   public final int g7() {
      return this.t1;
   }

   public final void x8(int var1) {
      this.c8.n5 = var1;
   }

   public final o8 j4() {
      return this.y8() ? null : this.z3;
   }

   public final void n5(Object var1) {
      this.c8.y4 = var1;
   }

   public final Object i9() {
      return this.c8.e2;
   }

   public final void l6(Object var1) {
      this.c8.e2 = var1;
   }

   public final boolean f5() {
      return this.v3;
   }

   @Override
   public s2 b3() {
      return this.f2;
   }

   public final boolean j3() {
      return this.p8;
   }

   public final int n1() {
      return this.t1 == 1 ? 1 : 2;
   }

   private boolean n5(b3 var1, boolean var2, b0$a6[] var3) {
      if (var1.n5().length() > 0) {
         this.e2 = true;
      }

      String var4 = var1.l6();
      String var5 = var1.n5();
      if (var3 != null) {
         if (com.aspose.slides.ms.System.u3.n5(var3, var1, b0$n5.n5()) >= 0) {
            return false;
         }
      } else {
         for (int var6 = this.t2 + 1; var6 < this.t2 + 1 + this.x8; var6++) {
            if (this.h0[var6].l6 == var4 && this.h0[var6].k5 == var5) {
               return false;
            }
         }
      }

      b0$a6 var7 = this.n5(var1.l6(), null, var1.n5(), var1.c8(), var1.k5(), var1.u3(), var1.s7(), var1.x8(), var1.h0());
      if (this.r8()) {
         if (this.o5 != null) {
            this.o5.n5(var1, this);
         }

         var7.e2 = var1.t2();
      }

      return var7 != null;
   }

   public final boolean n5(com.aspose.slides.internal.b8c.h9 var1) {
      String var2 = this.t4.n5(var1.z8().l6());
      String var3 = this.t4.n5(var1.j5());
      String var4 = this.t4.n5(var1.z8().n5());
      if (var3.length() == 0 && var4.length() > 0) {
         var3 = this.f2.l6(var4);
         if (var3 == null) {
            var3 = com.aspose.slides.ms.System.d1.n5;
         }
      }

      for (int var5 = this.t2 + 1; var5 < this.t2 + 1 + this.x8; var5++) {
         if (this.h0[var5].l6 == var2 && (this.h0[var5].k5 == var3 || this.h0[var5].u3 == var4 && var4 != null)) {
            return false;
         }
      }

      b0$a6 var6 = this.n5(var2, var4, var3, var1.z1(), var1.y4(), var1.n3(), var1.t9(), var1.e2(), var1.q0() != 0);
      var6.y4 = var1.y1() == null ? var1.a0() : var1.y1();
      var6.e2 = var1.s3();
      return true;
   }

   private b0$a6 n5(String var1, String var2, String var3, String var4, int var5, int var6, int var7, int var8, boolean var9) {
      b0$a6 var10 = this.n5(var1, var3, var3.length() > 0 ? null : var1);
      if (var2 != null) {
         var10.u3 = var2;
      }

      var10.n5(var4);
      var10.l6(true);
      var10.u9.n5(var5, var6);
      var10.h0.n5(var7, var8);
      if (var10.k5.length() == 0) {
         if (com.aspose.slides.ms.System.Xml.v8.n5(var10.l6, this.a7)) {
            this.l6(var10);
            if (!this.e2 && this.h0[this.t2].k5.length() == 0) {
               this.h0[this.t2].u3 = this.e5.k5;
            }
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var10.k5, this.a7)) {
         this.k5(var10);
         if (!this.e2) {
            String var11 = var10.l6;

            for (int var12 = this.t2; var12 < this.t2 + this.x8 + 1; var12++) {
               if (com.aspose.slides.ms.System.d1.a6(this.h0[var12].k5, var11)) {
                  this.h0[var12].u3 = this.f2.n5(var11);
               }
            }
         }
      } else if (var9) {
         this.u3(var10);
      }

      this.t9 = true;
      return var10;
   }

   public final void u9(boolean var1) {
      this.y8 = var1;
   }

   private boolean n5(com.aspose.slides.ms.System.r8 var1, String var2, String var3, o8 var4) {
      if (var4 == null) {
         return com.aspose.slides.ms.System.d1.a6(var2, var3);
      }

      if (var1 == null) {
         var1 = var4.n5(null, var2);
      }

      com.aspose.slides.ms.System.r8 var5 = var4.n5(null, var3);
      return var1.equals(var5);
   }

   private void n5(long var1, boolean var3) {
      if (this.d5 > 0L) {
         long var4 = this.d1 + var1;
         if (var4 < this.d1) {
            this.a6("The input document has exceeded a limit set by {0}.", "MaxCharactersInDocument");
         } else {
            this.d1 = var4;
         }

         if (this.d1 > this.d5) {
            this.a6("The input document has exceeded a limit set by {0}.", "MaxCharactersInDocument");
         }
      }

      if (this.s3 > 0L && var3) {
         long var6 = this.s4 + var1;
         if (var6 < this.s4) {
            this.a6("The input document has exceeded a limit set by {0}.", "MaxCharactersFromEntities");
         } else {
            this.s4 = var6;
         }

         if (this.s4 > this.s3) {
            this.a6("The input document has exceeded a limit set by {0}.", "MaxCharactersFromEntities");
         }
      }
   }

   public static String h0(String var0) {
      int var1 = var0.length();
      if (var1 <= 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      int var2 = 0;
      com.aspose.slides.internal.l7h.a5 var3 = null;

      while (var0.charAt(var2) == ' ') {
         if (++var2 == var1) {
            return " ";
         }
      }

      int var4;
      for (var4 = var2; var4 < var1; var4++) {
         if (var0.charAt(var4) == ' ') {
            int var5 = var4 + 1;

            while (var5 < var1 && var0.charAt(var5) == ' ') {
               var5++;
            }

            if (var5 == var1) {
               if (var3 == null) {
                  return com.aspose.slides.ms.System.d1.l6(var0, var2, var4 - var2);
               }

               var3.n5(var0, var2, var4 - var2);
               return var3.toString();
            }

            if (var5 > var4 + 1) {
               if (var3 == null) {
                  var3 = new com.aspose.slides.internal.l7h.a5(var1);
               }

               var3.n5(var0, var2, var4 - var2 + 1);
               var2 = var5;
               var4 = var5 - 1;
            }
         }
      }

      if (var3 == null) {
         return var2 == 0 ? var0 : com.aspose.slides.ms.System.d1.l6(var0, var2, var1 - var2);
      }

      if (var4 > var2) {
         var3.n5(var0, var2, var4 - var2);
      }

      return var3.toString();
   }

   public static void n5(char[] var0, int var1, int[] var2) {
      if (var2[0] > 0) {
         int var3 = var1;
         int var4 = var1 + var2[0];

         while (var0[var3] == ' ') {
            if (++var3 == var4) {
               var2[0] = 1;
               return;
            }
         }

         int var5 = var3 - var1;

         for (int var6 = var3; var6 < var4; var6++) {
            char var7;
            if ((var7 = var0[var6]) == ' ') {
               int var8 = var6 + 1;

               while (var8 < var4 && var0[var8] == ' ') {
                  var8++;
               }

               if (var8 == var4) {
                  var5 += var8 - var6;
                  break;
               }

               if (var8 > var6 + 1) {
                  var5 += var8 - var6 - 1;
                  var6 = var8 - 1;
               }
            }

            var0[var6 - var5] = var7;
         }

         var2[0] -= var5;
      }
   }

   public static void n5(char[] var0, int var1, char[] var2, int var3, int var4) {
      System.arraycopy(var0, var1, var2, var3, var4);
   }

   public static void n5(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      System.arraycopy(var0, var1, var2, var3, var4);
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(b0$h0.class, new r0());
   }
}
