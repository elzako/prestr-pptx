package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlSchemaException;

public abstract class t4 extends v5 implements Cloneable {
   private int e2 = 0;
   private r5 t9 = null;
   private t4 z1 = null;
   private e3m t4;
   private j9e q0;
   private static Hashtable z3 = new Hashtable();
   private static u1s[] m1 = new u1s[55];
   private static u1s k7;
   private static u1s m3;
   private static u1s z8;
   private static u1s j5;
   private static u1s w1;
   private static volatile u1s r4;
   private static volatile u1s c4;
   public static com.aspose.slides.ms.System.Xml.k6 n5 = new com.aspose.slides.ms.System.Xml.k6("anySimpleType", "http://www.w3.org/2001/XMLSchema");
   public static com.aspose.slides.ms.System.Xml.k6 l6 = new com.aspose.slides.ms.System.Xml.k6("anyType", "http://www.w3.org/2001/XMLSchema");
   public static c2 k5 = new s2();
   public static c2 u3 = new w3();
   public static c2 a6 = new y6();
   public static c2 u9 = new t2();
   public static c2 h0 = new b5();
   public static c2 c8 = new w8();
   public static c2 t2 = new y9();
   public static c2 s7 = new j6();
   public static c2 x8 = new g8();
   private static final t4 y2 = new a0();
   private static final t4 y1 = new d2();
   private static final t4 a0 = new d5();
   private static final t4 d2 = new s3();
   private static final t4 d5 = new p8();
   private static final t4 s3 = new f2();
   private static final t4 p8 = new i1();
   private static final t4 f2 = new e5();
   private static final t4 i1 = new o0();
   private static final t4 e5 = new z7();
   private static final t4 b3 = new v4();
   private static final t4 o0 = new t1();
   private static final t4 z7 = new a5();
   private static final t4 v4 = new h2();
   private static final t4 u6 = new v0();
   private static final t4 t1 = new q0();
   private static final t4 a5 = (t4)t1.n5(1, null);
   private static final t4 h2 = new z3();
   private static final t4 v0 = new f0();
   private static final t4 f0 = new a3();
   private static final t4 a3 = new p3();
   private static final t4 p3 = new x9();
   private static final t4 x9 = new m1();
   private static final t4 y0 = new k7();
   private static final t4 j9 = (t4)y0.n5(1, null);
   private static final t4 z6 = new y0();
   private static final t4 e9 = new j9();
   private static final t4 o5 = new z6();
   private static final t4 j8 = new e9();
   private static final t4 w2 = new o5();
   private static final t4 s0 = new j8();
   private static final t4 v8 = new r4();
   private static final t4 v3 = new z8();
   private static final t4 g7 = new w2();
   private static final t4 j4 = new j5();
   private static final t4 i9 = (t4)j4.n5(1, null);
   private static final t4 f5 = new s0();
   private static final t4 j3 = new v8();
   private static final t4 n1 = new v3();
   private static final t4 p6 = new w1();
   private static final t4 d1 = new j4();
   private static final t4 s4 = new c4();
   private static final t4 h6 = new y2();
   private static final t4 y8 = new i9();
   private static final t4 c3 = new f5();
   private static final t4 l4 = new j3();
   private static final t4 i6 = new n1();
   private static final t4 a7 = new p6();
   private static final t4 r8 = new d1();
   private static final t4 r1 = new y8();
   private static final t4 y5 = new c3();
   private static final t4 k8 = new l4();
   private static final t4 b5 = new i6();
   private static final t4 u8 = new r8();
   private static final t4 w5 = new r1();
   private static final t4 q1 = new y5();
   public static final t4 n3 = new g7();
   public static final t4 y4 = new s4();
   private static final t4 u5 = new y1();
   private static final t4 w8 = new u6();
   private static final t4 c2 = new a7();
   private static final t4 t3 = new k8();
   private static final t4[] u4 = new t4[]{c3, x9, y0, j9, t1, a5, j4, i9, p6, h2, h6, v3, null};
   private static final t4[] s9 = new t4[]{c3, x9, y0, j9, t1, a5, j4, i9, p6, h2, s4, v3, null};
   private static final t4$n5[] p7 = new t4$n5[]{
      new t4$n5("bin.base64", a0),
      new t4$n5("bin.hex", p3),
      new t4$n5("boolean", d2),
      new t4$n5("char", s3),
      new t4$n5("date", p8),
      new t4$n5("dateTime", i1),
      new t4$n5("dateTime.tz", e5),
      new t4$n5("decimal", o0),
      new t4$n5("entities", a5),
      new t4$n5("entity", t1),
      new t4$n5("enumeration", h2),
      new t4$n5("fixed.14.4", v0),
      new t4$n5("float", v4),
      new t4$n5("float.ieee.754.32", a3),
      new t4$n5("float.ieee.754.64", v4),
      new t4$n5("i1", d5),
      new t4$n5("i2", y8),
      new t4$n5("i4", z6),
      new t4$n5("i8", j8),
      new t4$n5("id", x9),
      new t4$n5("idref", y0),
      new t4$n5("idrefs", j9),
      new t4$n5("int", z6),
      new t4$n5("nmtoken", j4),
      new t4$n5("nmtokens", i9),
      new t4$n5("notation", p6),
      new t4$n5("number", v4),
      new t4$n5("r4", a3),
      new t4$n5("r8", v4),
      new t4$n5("string", c3),
      new t4$n5("time", i6),
      new t4$n5("time.tz", a7),
      new t4$n5("ui1", r1),
      new t4$n5("ui2", b5),
      new t4$n5("ui4", y5),
      new t4$n5("ui8", k8),
      new t4$n5("uri", y1),
      new t4$n5("uuid", u8)
   };
   private static final t4$n5[] z5 = new t4$n5[]{
      new t4$n5("ENTITIES", a5, 11),
      new t4$n5("ENTITY", t1, 11),
      new t4$n5("ID", x9, 5),
      new t4$n5("IDREF", y0, 5),
      new t4$n5("IDREFS", j9, 11),
      new t4$n5("NCName", v3, 9),
      new t4$n5("NMTOKEN", j4, 40),
      new t4$n5("NMTOKENS", i9, 11),
      new t4$n5("NOTATION", p6, 11),
      new t4$n5("Name", v8, 40),
      new t4$n5("QName", s4, 11),
      new t4$n5("anySimpleType", y2, -1),
      new t4$n5("anyURI", y1, 11),
      new t4$n5("base64Binary", a0, 11),
      new t4$n5("boolean", d2, 11),
      new t4$n5("byte", d5, 37),
      new t4$n5("date", p8, 11),
      new t4$n5("dateTime", f2, 11),
      new t4$n5("decimal", o0, 11),
      new t4$n5("double", z7, 11),
      new t4$n5("duration", u6, 11),
      new t4$n5("float", f0, 11),
      new t4$n5("gDay", b3, 11),
      new t4$n5("gMonth", w2, 11),
      new t4$n5("gMonthDay", s0, 11),
      new t4$n5("gYear", w5, 11),
      new t4$n5("gYearMonth", q1, 11),
      new t4$n5("hexBinary", p3, 11),
      new t4$n5("int", z6, 31),
      new t4$n5("integer", e9, 18),
      new t4$n5("language", o5, 40),
      new t4$n5("long", j8, 29),
      new t4$n5("negativeInteger", g7, 34),
      new t4$n5("nonNegativeInteger", f5, 29),
      new t4$n5("nonPositiveInteger", j3, 29),
      new t4$n5("normalizedString", n1, 38),
      new t4$n5("positiveInteger", d1, 33),
      new t4$n5("short", y8, 28),
      new t4$n5("string", c3, 11),
      new t4$n5("time", l4, 11),
      new t4$n5("token", r8, 35),
      new t4$n5("unsignedByte", r1, 44),
      new t4$n5("unsignedInt", y5, 43),
      new t4$n5("unsignedLong", k8, 33),
      new t4$n5("unsignedShort", b5, 42)
   };

   public static u1s n5() {
      return k7;
   }

   public static u1s l6() {
      return z8;
   }

   public static t4 n5(int var0) {
      return u4[var0];
   }

   public static t4 l6(int var0) {
      return s9[var0];
   }

   public static t4 n5(String var0) {
      int var1 = com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(p7)), var0, null);
      return var1 < 0 ? null : t4$n5.n5(p7[var1]);
   }

   private static t4 k5(String var0) {
      int var1 = com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(z5)), var0, null);
      return var1 < 0 ? null : t4$n5.n5(z5[var1]);
   }

   public static u1s n5(com.aspose.slides.ms.System.Xml.k6 var0, v5 var1) {
      u1s var2 = new u1s();
      var2.l6(var0);
      var2.n5(var1);
      var2.n5(new t6(var1));
      var2.u6().n5(var2);
      return var2;
   }

   public static void n5(u1s var0, u1s var1) {
      var0.n5(var1);
      var0.c8(4);
      if (var0.b3().x8() == 0) {
         r3q var2 = new r3q();
         var2.n5(var1.r4());
         var0.n5(var2);
      }

      if (var0.b3().x8() == 1) {
         e5a var4 = new e5a();
         var0.c8(8);
         switch (var0.b3().n3()) {
            case 34:
               u1s var6 = m1[34];
               var4.l6(var6);
               var4.n5(var6);
               break;
            case 38:
               u1s var5 = m1[38];
               var4.l6(var5);
               var4.n5(var5);
               break;
            case 39:
               u1s var3 = m1[39];
               var4.l6(var3);
               var4.n5(var3);
         }

         var0.n5(var4);
      }
   }

   public static void k5() {
      t4$n5 var0 = z5[11];
      com.aspose.slides.ms.System.Xml.k6 var1 = new com.aspose.slides.ms.System.Xml.k6(var0.n5(), "http://www.w3.org/2001/XMLSchema");
      t4 var2 = k5(var1.l6());
      k7 = n5(var1, var2);
      var2.q0 = k7;
      z3.addItem(var1, k7);

      for (int var3 = 0; var3 < z5.length; var3++) {
         if (var3 != 11) {
            var0 = z5[var3];
            var1 = new com.aspose.slides.ms.System.Xml.k6(var0.n5(), "http://www.w3.org/2001/XMLSchema");
            var2 = k5(var1.l6());
            u1s var4 = n5(var1, var2);
            var2.q0 = var4;
            z3.addItem(var1, var4);
            if (var2.e2 == 0) {
               m1[var2.n3()] = var4;
            }
         }
      }

      for (int var15 = 0; var15 < z5.length; var15++) {
         if (var15 != 11) {
            var0 = z5[var15];
            u1s var5 = (u1s)z3.get_Item(new com.aspose.slides.ms.System.Xml.k6(var0.n5(), "http://www.w3.org/2001/XMLSchema"));
            if (var0.l6() == 11) {
               n5(var5, k7);
            } else {
               u1s var6 = (u1s)z3.get_Item(new com.aspose.slides.ms.System.Xml.k6(z5[var0.l6()].n5(), "http://www.w3.org/2001/XMLSchema"));
               n5(var5, var6);
            }
         }
      }

      var1 = new com.aspose.slides.ms.System.Xml.k6("anyAtomicType", "http://www.w3.org/2003/11/XPath-datatypes");
      m3 = n5(var1, u5);
      u5.q0 = m3;
      n5(m3, k7);
      z3.addItem(var1, m3);
      m1[10] = m3;
      var1 = new com.aspose.slides.ms.System.Xml.k6("untypedAtomic", "http://www.w3.org/2003/11/XPath-datatypes");
      z8 = n5(var1, c2);
      c2.q0 = z8;
      n5(z8, m3);
      z3.addItem(var1, z8);
      m1[11] = z8;
      var1 = new com.aspose.slides.ms.System.Xml.k6("yearMonthDuration", "http://www.w3.org/2003/11/XPath-datatypes");
      j5 = n5(var1, t3);
      t3.q0 = j5;
      n5(j5, m1[17]);
      z3.addItem(var1, j5);
      m1[53] = j5;
      var1 = new com.aspose.slides.ms.System.Xml.k6("dayTimeDuration", "http://www.w3.org/2003/11/XPath-datatypes");
      w1 = n5(var1, w8);
      w8.q0 = w1;
      n5(w1, m1[17]);
      z3.addItem(var1, w1);
      m1[54] = w1;
   }

   public static u1s k5(int var0) {
      return m1[var0];
   }

   public static u1s n5(com.aspose.slides.ms.System.Xml.k6 var0) {
      return (u1s)z3.get_Item(var0);
   }

   public static u1s u3() {
      if (r4 == null) {
         u1s var0 = k5(31);
         u1s var1 = com.aspose.slides.internal.v6g.k5.n5(var0.d2(), u1s.class);
         var1.n5(n3);
         var1.n5(new t6(n3));
         var1.u6().n5(var1);
         r4 = var1;
      }

      return r4;
   }

   public static u1s a6() {
      if (c4 == null) {
         u1s var0 = k5(32);
         u1s var1 = com.aspose.slides.internal.v6g.k5.n5(var0.d2(), u1s.class);
         var1.n5(y4);
         var1.n5(new t6(y4));
         var1.u6().n5(var1);
         c4 = var1;
      }

      return c4;
   }

   public static u1s[] u9() {
      return m1;
   }

   public static int u3(int var0) {
      u1s var1 = m1[var0];

      while (var1.y1() != n5()) {
         var1 = com.aspose.slides.internal.v6g.k5.n5(var1.y1(), u1s.class);
      }

      return var1.o0();
   }

   @Override
   public v5 n5(z4 var1, com.aspose.slides.ms.System.Xml.z9 var2, j9e var3) {
      t4 var4 = (t4)this.k7();
      var4.t9 = this.h0().n5(this, var1, var2);
      var4.z1 = this;
      var4.q0 = var3;
      var4.t4 = null;
      return var4;
   }

   @Override
   public v5 n5(j9e var1) {
      return this.n5(0, var1);
   }

   public final v5 n5(int var1, j9e var2) {
      if (this.e2 == 1) {
         throw new XmlSchemaException("A list data type must be derived from an atomic or union data type.", com.aspose.slides.ms.System.d1.n5);
      }

      if (this.e2 == 2 && !((h6)this).z8()) {
         throw new XmlSchemaException("A list data type must be derived from an atomic or union data type.", com.aspose.slides.ms.System.d1.n5);
      }

      m3 var3 = new m3(this, var1);
      ((t4)var3).e2 = 1;
      ((t4)var3).t9 = null;
      ((t4)var3).z1 = y2;
      ((t4)var3).q0 = var2;
      return var3;
   }

   public static t4 n5(u1s[] var0, j9e var1) {
      h6 var2 = new h6(var0);
      ((t4)var2).z1 = y2;
      ((t4)var2).e2 = 2;
      ((t4)var2).q0 = var1;
      return var2;
   }

   @Override
   public void n5(d0 var1, x4 var2) {
   }

   @Override
   public boolean n5(v5 var1) {
      if (var1 == null) {
         return false;
      }

      for (t4 var2 = this; var2 != null; var2 = var2.z1) {
         if (var2 == var1) {
            return true;
         }
      }

      if (((t4)var1).z1 == null) {
         com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(this);
         com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.j8.n5(var1);
         return var3 == var4 || var4.n5(var3);
      } else if (var1.x8() == 2 && !var1.e2() && !var1.t9() && this.e2 != 2) {
         return ((h6)var1).n5(this);
      } else {
         return (this.e2 == 2 || this.e2 == 1) && this.t9 == null ? var1 == k7.b3() : false;
      }
   }

   @Override
   public boolean n5(Object var1, Object var2) {
      return this.l6(var1, var2) == 0;
   }

   @Override
   public boolean l6(v5 var1) {
      int var2 = this.n3();
      int var3 = var1.n3();
      if (var2 == var3) {
         return true;
      } else {
         return u3(var2) == u3(var3) ? true : this.n5(var1) || var1.n5(this);
      }
   }

   public e3m l6(j9e var1) {
      return null;
   }

   public c2 h0() {
      return u3;
   }

   @Override
   public e3m c8() {
      if (this.t4 == null) {
         this.t4 = this.l6(this.q0);
      }

      return this.t4;
   }

   @Override
   public int t2() {
      return 12;
   }

   @Override
   public com.aspose.slides.ms.System.y8 s7() {
      return com.aspose.slides.internal.v6g.k5.n5(String.class);
   }

   @Override
   public int x8() {
      return this.e2;
   }

   @Override
   public int n3() {
      return 0;
   }

   @Override
   public r5 y4() {
      return this.t9;
   }

   @Override
   public boolean e2() {
      int var1 = this.t9 != null ? this.t9.y4 : 0;
      return var1 != 0 && (var1 & 3112) != 0;
   }

   @Override
   public boolean t9() {
      int var1 = this.t9 != null ? this.t9.y4 : 0;
      return var1 != 0 && (var1 & 4055) != 0;
   }

   protected final t4 z1() {
      return this.z1;
   }

   public abstract com.aspose.slides.ms.System.y8 t4();

   public abstract int q0();

   @Override
   public int z3() {
      return 0;
   }

   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      Object var4 = null;
      Object[] var5 = new Object[]{var4};
      RuntimeException var6 = this.n5(var1, var2, var3, var5);
      var4 = var5[0];
      if (var6 != null) {
         throw new XmlSchemaException(
            "The value '{0}' is invalid according to its Schema type '{1}' - {2}", new String[]{var1, this.m1(), var6.getMessage()}, var6, null, 0, 0, null
         );
      } else if (this.x8() == 2) {
         e4j var7 = com.aspose.slides.internal.v6g.k5.n5(var4, e4j.class);
         return var7.l6();
      } else {
         return var4;
      }
   }

   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, boolean var4) {
      if (var4) {
         Object var5 = null;
         Object[] var6 = new Object[]{var5};
         RuntimeException var7 = this.n5(var1, var2, var3, var6);
         var5 = var6[0];
         if (var7 != null) {
            throw new XmlSchemaException(
               "The value '{0}' is invalid according to its Schema type '{1}' - {2}", new String[]{var1, this.m1(), var7.getMessage()}, var7, null, 0, 0, null
            );
         } else {
            return var5;
         }
      } else {
         return this.n5(var1, var2, var3);
      }
   }

   @Override
   public RuntimeException n5(Object var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      RuntimeException var5 = null;
      var4[0] = null;
      if (var1 == null) {
         return new ArgumentNullException("value");
      }

      String var6 = com.aspose.slides.internal.v6g.k5.n5(var1, String.class);
      if (var6 != null) {
         return this.n5(var6, var2, var3, var4);
      }

      try {
         Object var7 = var1;
         if (com.aspose.slides.ms.System.j8.n5(var1) != this.s7()) {
            var7 = this.c8().n5(var1, this.s7(), var3);
         }

         if (this.e2()) {
            String var8 = (String)this.c8().n5(var1, com.aspose.slides.internal.v6g.k5.n5(String.class), var3);
            String[] var9 = new String[]{var8};
            var5 = this.h0().n5(var9, this);
            var8 = var9[0];
            if (var5 != null) {
               return var5;
            }
         }

         if (this.t9()) {
            var5 = this.h0().l6(var7, this);
            if (var5 != null) {
               return var5;
            }
         }

         var4[0] = var7;
         return null;
      } catch (FormatException var10) {
         var5 = var10;
      } catch (ClassCastException var11) {
         var5 = var11;
      } catch (OverflowException var12) {
         var5 = var12;
      } catch (ArgumentException var13) {
         var5 = var13;
      }

      return var5;
   }

   public final String m1() {
      j9e var1 = this.q0;
      String var2;
      if (var1 != null && !var1.r4().k5()) {
         var2 = var1.r4().toString();
      } else {
         var2 = this.j5();
      }

      return var2;
   }

   protected final int n5(byte[] var1, byte[] var2) {
      int var3 = var1.length;
      if (var3 != var2.length) {
         return -1;
      }

      for (int var4 = 0; var4 < var3; var4++) {
         if ((var1[var4] & 255) != (var2[var4] & 255)) {
            return -1;
         }
      }

      return 0;
   }

   protected Object k7() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   static {
      k5();
   }
}
