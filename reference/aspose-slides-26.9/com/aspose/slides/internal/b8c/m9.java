package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlException;

public abstract class m9 extends e3m {
   private j9e n5;
   private int l6;
   private com.aspose.slides.ms.System.y8 d5;
   protected static final com.aspose.slides.ms.System.y8 k5 = com.aspose.slides.internal.v6g.k5.n5(ICollection.class);
   protected static final com.aspose.slides.ms.System.y8 u3 = com.aspose.slides.internal.v6g.k5.n5(IEnumerable.class);
   protected static final com.aspose.slides.ms.System.y8 a6 = com.aspose.slides.internal.v6g.k5.n5(IList.class);
   protected static final com.aspose.slides.ms.System.y8 u9 = com.aspose.slides.internal.v6g.k5.n5(Object[].class);
   protected static final com.aspose.slides.ms.System.y8 h0 = com.aspose.slides.internal.v6g.k5.n5(String[].class);
   protected static final com.aspose.slides.ms.System.y8 c8 = com.aspose.slides.internal.v6g.k5.n5(x6[].class);
   protected static final com.aspose.slides.ms.System.y8 t2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.c4.class);
   protected static final com.aspose.slides.ms.System.y8 s7 = com.aspose.slides.internal.v6g.k5.n5(Integer.class);
   protected static final com.aspose.slides.ms.System.y8 x8 = com.aspose.slides.internal.v6g.k5.n5(Long.class);
   protected static final com.aspose.slides.ms.System.y8 n3 = com.aspose.slides.internal.v6g.k5.n5(String.class);
   protected static final com.aspose.slides.ms.System.y8 y4 = com.aspose.slides.internal.v6g.k5.n5(x6.class);
   protected static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(Object.class);
   protected static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(Byte.class);
   protected static final com.aspose.slides.ms.System.y8 z1 = com.aspose.slides.internal.v6g.k5.n5(Short.class);
   protected static final com.aspose.slides.ms.System.y8 t4 = com.aspose.slides.internal.v6g.k5.n5(Byte.class);
   protected static final com.aspose.slides.ms.System.y8 q0 = com.aspose.slides.internal.v6g.k5.n5(Integer.class);
   protected static final com.aspose.slides.ms.System.y8 z3 = com.aspose.slides.internal.v6g.k5.n5(Long.class);
   protected static final com.aspose.slides.ms.System.y8 m1 = com.aspose.slides.internal.v6g.k5.n5(long.class);
   protected static final com.aspose.slides.ms.System.y8 k7 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.x6s.u3.class);
   protected static final com.aspose.slides.ms.System.y8 m3 = com.aspose.slides.internal.v6g.k5.n5(Double.class);
   protected static final com.aspose.slides.ms.System.y8 z8 = com.aspose.slides.internal.v6g.k5.n5(Float.class);
   protected static final com.aspose.slides.ms.System.y8 j5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.j5.class);
   protected static final com.aspose.slides.ms.System.y8 w1 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.w1.class);
   protected static final com.aspose.slides.ms.System.y8 r4 = com.aspose.slides.internal.v6g.k5.n5(Boolean.class);
   protected static final com.aspose.slides.ms.System.y8 c4 = com.aspose.slides.internal.v6g.k5.n5(Byte[].class);
   protected static final com.aspose.slides.ms.System.y8 y2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.Xml.k6.class);
   protected static final com.aspose.slides.ms.System.y8 y1 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.r8.class);
   protected static final com.aspose.slides.ms.System.y8 a0 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.s4.class);
   protected static final com.aspose.slides.ms.System.y8 d2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.x6s.a6.class);

   protected m9(j9e var1) {
      v5 var2 = var1.b3();

      while (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, u1s.class)) {
         var1 = var1.y1();
      }

      if (var1 == null) {
         var1 = j9e.k5(var2.n3());
      }

      this.n5 = var1;
      this.l6 = var1.o0();
      this.d5 = var1.b3().s7();
   }

   protected m9(int var1) {
      switch (var1) {
         case 1:
            this.d5 = k7;
            break;
         case 2:
            this.d5 = d2;
            break;
         case 10:
            this.d5 = y4;
      }

      this.l6 = var1;
   }

   protected m9(m9 var1) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.d5 = com.aspose.slides.ms.System.j8.n5(com.aspose.slides.ms.System.u3.n5(var1.u3(), 0));
   }

   protected m9(m9 var1, com.aspose.slides.ms.System.y8 var2) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.d5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.j5 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, r4, null), boolean.class);
   }

   @Override
   public boolean n5(Double var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, r4, null), boolean.class);
   }

   @Override
   public boolean n5(Integer var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, r4, null), boolean.class);
   }

   @Override
   public boolean n5(Long var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, r4, null), boolean.class);
   }

   @Override
   public boolean n5(Object var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, r4, null), boolean.class);
   }

   @Override
   public com.aspose.slides.ms.System.j5 n5(Boolean var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   public com.aspose.slides.ms.System.j5 n5(com.aspose.slides.ms.System.w1 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   @Override
   public com.aspose.slides.ms.System.j5 l6(Double var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   @Override
   public com.aspose.slides.ms.System.j5 l6(Integer var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   @Override
   public com.aspose.slides.ms.System.j5 l6(Long var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   public com.aspose.slides.ms.System.j5 n5(String var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   @Override
   public com.aspose.slides.ms.System.j5 l6(Object var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   public com.aspose.slides.ms.System.w1 l6(com.aspose.slides.ms.System.j5 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, w1, null), com.aspose.slides.ms.System.w1.class);
   }

   public com.aspose.slides.ms.System.w1 l6(String var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, w1, null), com.aspose.slides.ms.System.w1.class);
   }

   public com.aspose.slides.ms.System.w1 k5(Object var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, w1, null), com.aspose.slides.ms.System.w1.class);
   }

   public com.aspose.slides.ms.System.c4 k5(String var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, t2, null), com.aspose.slides.ms.System.c4.class);
   }

   @Override
   public com.aspose.slides.ms.System.c4 u3(Object var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, t2, null), com.aspose.slides.ms.System.c4.class);
   }

   @Override
   public double l6(Boolean var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, m3, null), double.class);
   }

   @Override
   public double k5(com.aspose.slides.ms.System.j5 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, m3, null), double.class);
   }

   @Override
   public double k5(Integer var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, m3, null), double.class);
   }

   @Override
   public double k5(Long var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, m3, null), double.class);
   }

   public double u3(String var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, m3, null), double.class);
   }

   @Override
   public double a6(Object var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, m3, null), double.class);
   }

   @Override
   public int k5(Boolean var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, s7, null), int.class);
   }

   @Override
   public int u3(com.aspose.slides.ms.System.j5 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, s7, null), int.class);
   }

   @Override
   public int k5(Double var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, s7, null), int.class);
   }

   @Override
   public int u3(Long var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, s7, null), int.class);
   }

   public int a6(String var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, s7, null), int.class);
   }

   @Override
   public int u9(Object var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, s7, null), int.class);
   }

   @Override
   public long u3(Boolean var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, x8, null), long.class);
   }

   @Override
   public long a6(com.aspose.slides.ms.System.j5 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, x8, null), long.class);
   }

   @Override
   public long u3(Double var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, x8, null), long.class);
   }

   @Override
   public long u3(Integer var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, x8, null), long.class);
   }

   public long u9(String var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, x8, null), long.class);
   }

   @Override
   public long h0(Object var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, x8, null), long.class);
   }

   public float a6(Double var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, z8, null), float.class);
   }

   public float h0(String var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, z8, null), float.class);
   }

   public float c8(Object var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1, z8, null), float.class);
   }

   @Override
   public String a6(Boolean var1) {
      return (String)this.n5(var1, n3, null);
   }

   @Override
   public String u9(com.aspose.slides.ms.System.j5 var1) {
      return (String)this.n5(var1, n3, null);
   }

   public String l6(com.aspose.slides.ms.System.w1 var1) {
      return (String)this.n5(var1, n3, null);
   }

   public String n5(com.aspose.slides.ms.System.c4 var1) {
      return (String)this.n5(var1, n3, null);
   }

   @Override
   public String u9(Double var1) {
      return (String)this.n5(var1, n3, null);
   }

   @Override
   public String a6(Integer var1) {
      return (String)this.n5(var1, n3, null);
   }

   @Override
   public String a6(Long var1) {
      return (String)this.n5(var1, n3, null);
   }

   public String n5(Float var1) {
      return (String)this.n5(var1, n3, null);
   }

   @Override
   public String n5(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      return (String)this.n5(var1, n3, var2);
   }

   @Override
   public String t2(Object var1) {
      return this.n5((Object)var1, (com.aspose.slides.ms.System.Xml.a3)null);
   }

   @Override
   public Object n5(Boolean var1, com.aspose.slides.ms.System.y8 var2) {
      return this.n5(var1, var2, null);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.j5 var1, com.aspose.slides.ms.System.y8 var2) {
      return this.n5(var1, var2, null);
   }

   public Object n5(com.aspose.slides.ms.System.c4 var1, com.aspose.slides.ms.System.y8 var2) {
      return this.n5(var1, var2, null);
   }

   @Override
   public Object n5(Double var1, com.aspose.slides.ms.System.y8 var2) {
      return this.n5(var1, var2, null);
   }

   @Override
   public Object n5(Integer var1, com.aspose.slides.ms.System.y8 var2) {
      return this.n5(var1, var2, null);
   }

   @Override
   public Object n5(Long var1, com.aspose.slides.ms.System.y8 var2) {
      return this.n5(var1, var2, null);
   }

   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      return this.n5((Object)var1, var2, var3);
   }

   @Override
   public Object n5(Object var1, com.aspose.slides.ms.System.y8 var2) {
      return this.n5(var1, var2, null);
   }

   protected final j9e n5() {
      return this.n5;
   }

   protected final int l6() {
      return this.l6;
   }

   protected final String k5() {
      j9e var1 = this.n5;
      if (var1 == null) {
         if (this.l6 == 2) {
            return "node";
         } else {
            return this.l6 == 10 ? "xdt:anyAtomicType" : "item";
         }
      } else {
         while (var1.r4().k5()) {
            var1 = var1.y1();
         }

         return n5(var1.r4());
      }
   }

   protected final com.aspose.slides.ms.System.y8 u3() {
      return this.d5;
   }

   protected static boolean n5(com.aspose.slides.ms.System.y8 var0, com.aspose.slides.ms.System.y8 var1) {
      while (var0 != null) {
         if (var0 == var1) {
            return true;
         }

         var0 = var0.n5();
      }

      return false;
   }

   protected final RuntimeException l6(com.aspose.slides.ms.System.y8 var1, com.aspose.slides.ms.System.y8 var2) {
      return var1 == var2
         ? new InvalidCastException(com.aspose.slides.ms.System.Xml.v3.n5("Xml type '{0}' does not support Clr type '{1}'.", this.k5(), var1.s7()))
         : new InvalidCastException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Xml type '{0}' does not support a conversion from Clr type '{1}' to Clr type '{2}'.", this.k5(), var1.s7(), var2.s7()
            )
         );
   }

   protected static String n5(com.aspose.slides.ms.System.Xml.k6 var0) {
      if (var0.n5().length() == 0) {
         return var0.l6();
      } else if ("http://www.w3.org/2001/XMLSchema".equals(var0.n5())) {
         return com.aspose.slides.ms.System.d1.n5(new String[]{"xs:", var0.l6()});
      } else {
         return "http://www.w3.org/2003/11/XPath-datatypes".equals(var0.n5())
            ? com.aspose.slides.ms.System.d1.n5(new String[]{"xdt:", var0.l6()})
            : com.aspose.slides.ms.System.d1.n5(new String[]{"{", var0.n5(), "}", var0.l6()});
      }
   }

   protected Object l6(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      throw this.l6(com.aspose.slides.ms.System.j8.n5(var1), var2);
   }

   protected static byte[] c8(String var0) {
      return com.aspose.slides.ms.System.z3.s7(com.aspose.slides.ms.System.Xml.f4.j5(var0));
   }

   protected static com.aspose.slides.ms.System.j5 t2(String var0) {
      return r6o.n5(new r6o(var0, 4));
   }

   protected static com.aspose.slides.ms.System.j5 s7(String var0) {
      return r6o.n5(new r6o(var0, 1));
   }

   protected static com.aspose.slides.ms.System.s4 x8(String var0) {
      return new f2i(var0, 2).n5(2);
   }

   protected static com.aspose.slides.ms.System.s4 n3(String var0) {
      return new f2i(var0, 0).n5(0);
   }

   protected static com.aspose.slides.ms.System.j5 y4(String var0) {
      return r6o.n5(new r6o(var0, 64));
   }

   protected static com.aspose.slides.ms.System.j5 e2(String var0) {
      return r6o.n5(new r6o(var0, 128));
   }

   protected static com.aspose.slides.ms.System.j5 t9(String var0) {
      return r6o.n5(new r6o(var0, 32));
   }

   protected static com.aspose.slides.ms.System.j5 z1(String var0) {
      return r6o.n5(new r6o(var0, 16));
   }

   protected static com.aspose.slides.ms.System.j5 t4(String var0) {
      return r6o.n5(new r6o(var0, 8));
   }

   protected static com.aspose.slides.ms.System.w1 q0(String var0) {
      return r6o.l6(new r6o(var0, 4));
   }

   protected static com.aspose.slides.ms.System.w1 z3(String var0) {
      return r6o.l6(new r6o(var0, 1));
   }

   protected static com.aspose.slides.ms.System.w1 m1(String var0) {
      return r6o.l6(new r6o(var0, 64));
   }

   protected static com.aspose.slides.ms.System.w1 k7(String var0) {
      return r6o.l6(new r6o(var0, 128));
   }

   protected static com.aspose.slides.ms.System.w1 m3(String var0) {
      return r6o.l6(new r6o(var0, 32));
   }

   protected static com.aspose.slides.ms.System.w1 z8(String var0) {
      return r6o.l6(new r6o(var0, 16));
   }

   protected static com.aspose.slides.ms.System.w1 j5(String var0) {
      return r6o.l6(new r6o(var0, 8));
   }

   protected static byte[] w1(String var0) {
      try {
         return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.ms.System.Xml.f4.j5(var0), false);
      } catch (XmlException var2) {
         throw new FormatException(var2.getMessage());
      }
   }

   protected static com.aspose.slides.ms.System.Xml.k6 n5(String var0, com.aspose.slides.ms.System.Xml.a3 var1) {
      String var2 = null;
      String var3 = null;
      var0 = com.aspose.slides.ms.System.d1.l6(var0);

      try {
         String[] var4 = new String[]{var2};
         String[] var5 = new String[]{var3};
         com.aspose.slides.ms.System.Xml.y5.n5(var0, var4, var5);
         var2 = var4[0];
         var3 = var5[0];
      } catch (XmlException var7) {
         throw new FormatException(var7.getMessage());
      }

      if (var1 == null) {
         throw new InvalidCastException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "The String '{0}' cannot be represented as an XmlQualifiedName.  A namespace for prefix '{1}' cannot be found.", var0, var2
            )
         );
      } else {
         String var6 = var1.n5(var2);
         if (var6 == null) {
            throw new InvalidCastException(
               com.aspose.slides.ms.System.Xml.v3.n5(
                  "The String '{0}' cannot be represented as an XmlQualifiedName.  A namespace for prefix '{1}' cannot be found.", var0, var2
               )
            );
         } else {
            return new com.aspose.slides.ms.System.Xml.k6(var3, var6);
         }
      }
   }

   protected static com.aspose.slides.ms.System.j5 r4(String var0) {
      return r6o.n5(new r6o(var0, 2));
   }

   protected static com.aspose.slides.ms.System.w1 c4(String var0) {
      return r6o.l6(new r6o(var0, 2));
   }

   protected static com.aspose.slides.ms.System.s4 y2(String var0) {
      return new f2i(var0, 1).n5(1);
   }

   protected static String n5(com.aspose.slides.ms.System.r8 var0) {
      return var0.m1();
   }

   protected static String n5(byte[] var0) {
      return com.aspose.slides.ms.System.z3.n5(var0);
   }

   protected static String h0(com.aspose.slides.ms.System.j5 var0) {
      return new r6o(var0.m3(), 4).toString();
   }

   protected static String c8(com.aspose.slides.ms.System.j5 var0) {
      return new r6o(var0.m3(), 1).toString();
   }

   protected static String n5(com.aspose.slides.ms.System.s4 var0) {
      return new f2i(var0.n3(), 2).l6(2);
   }

   protected static String l6(com.aspose.slides.ms.System.s4 var0) {
      return new f2i(var0.n3(), 0).l6(0);
   }

   protected static String t2(com.aspose.slides.ms.System.j5 var0) {
      return new r6o(var0.m3(), 64).toString();
   }

   protected static String s7(com.aspose.slides.ms.System.j5 var0) {
      return new r6o(var0.m3(), 128).toString();
   }

   protected static String x8(com.aspose.slides.ms.System.j5 var0) {
      return new r6o(var0.m3(), 32).toString();
   }

   protected static String n3(com.aspose.slides.ms.System.j5 var0) {
      return new r6o(var0.m3(), 16).toString();
   }

   protected static String y4(com.aspose.slides.ms.System.j5 var0) {
      return new r6o(var0.m3(), 8).toString();
   }

   protected static String k5(com.aspose.slides.ms.System.w1 var0) {
      return new r6o(var0.a6(), 4).toString();
   }

   protected static String u3(com.aspose.slides.ms.System.w1 var0) {
      return new r6o(var0.a6(), 1).toString();
   }

   protected static String a6(com.aspose.slides.ms.System.w1 var0) {
      return new r6o(var0.a6(), 64).toString();
   }

   protected static String u9(com.aspose.slides.ms.System.w1 var0) {
      return new r6o(var0.a6(), 128).toString();
   }

   protected static String h0(com.aspose.slides.ms.System.w1 var0) {
      return new r6o(var0.a6(), 32).toString();
   }

   protected static String c8(com.aspose.slides.ms.System.w1 var0) {
      return new r6o(var0.a6(), 16).toString();
   }

   protected static String t2(com.aspose.slides.ms.System.w1 var0) {
      return new r6o(var0.a6(), 8).toString();
   }

   protected static String n5(com.aspose.slides.ms.System.Xml.k6 var0, com.aspose.slides.ms.System.Xml.a3 var1) {
      if (var1 == null) {
         return com.aspose.slides.ms.System.d1.n5(new String[]{"{", var0.n5(), "}", var0.l6()});
      } else {
         String var2 = var1.l6(var0.n5());
         if (var2 == null) {
            throw new InvalidCastException(
               com.aspose.slides.ms.System.Xml.v3.n5(
                  "The QName '{0}' cannot be represented as a String.  A prefix for namespace '{1}' cannot be found.", var0.toString(), var0.n5()
               )
            );
         } else {
            return var2.length() != 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{var2, ":", var0.l6()}) : var0.l6();
         }
      }
   }

   protected static String e2(com.aspose.slides.ms.System.j5 var0) {
      return new r6o(var0.m3(), 2).toString();
   }

   protected static String s7(com.aspose.slides.ms.System.w1 var0) {
      return new r6o(var0.a6(), 2).toString();
   }

   protected static String k5(com.aspose.slides.ms.System.s4 var0) {
      return new f2i(var0.n3(), 1).l6(1);
   }

   public static com.aspose.slides.ms.System.j5 x8(com.aspose.slides.ms.System.w1 var0) {
      return var0.l6();
   }

   public static int l6(com.aspose.slides.ms.System.c4 var0) {
      if (!com.aspose.slides.ms.System.c4.x8(var0, com.aspose.slides.internal.v6g.k5.s7(Integer.MIN_VALUE, 9))
         && !com.aspose.slides.ms.System.c4.t2(var0, com.aspose.slides.internal.v6g.k5.s7(Integer.MAX_VALUE, 9))) {
         return com.aspose.slides.internal.v6g.k5.u3(var0, 15);
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.l6()), "Int32"
            )
         );
      }
   }

   protected static long k5(com.aspose.slides.ms.System.c4 var0) {
      if (!com.aspose.slides.ms.System.c4.x8(var0, com.aspose.slides.internal.v6g.k5.s7(Long.MIN_VALUE, 11))
         && !com.aspose.slides.ms.System.c4.t2(var0, com.aspose.slides.internal.v6g.k5.s7(Long.MAX_VALUE, 11))) {
         return com.aspose.slides.internal.v6g.k5.u9(var0, 15);
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.l6()), "Int64"
            )
         );
      }
   }

   protected static long u3(com.aspose.slides.ms.System.c4 var0) {
      if (!com.aspose.slides.ms.System.c4.x8(var0, com.aspose.slides.internal.v6g.k5.s7(0L, 12))
         && !com.aspose.slides.ms.System.c4.t2(var0, com.aspose.slides.internal.v6g.k5.s7(-1L, 12))) {
         return com.aspose.slides.internal.v6g.k5.h0(var0, 15);
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.l6()), "UInt64"
            )
         );
      }
   }

   protected static byte u9(Integer var0) {
      if (var0 >= 0 && var0 <= 255) {
         return (byte)var0.intValue();
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.intValue()), "Byte"
            )
         );
      }
   }

   protected static short h0(Integer var0) {
      if (var0 >= -32768 && var0 <= 32767) {
         return (short)var0.intValue();
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.intValue()), "Int16"
            )
         );
      }
   }

   protected static byte c8(Integer var0) {
      if (var0 >= -128 && var0 <= 127) {
         return (byte)var0.intValue();
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.intValue()), "SByte"
            )
         );
      }
   }

   protected static int t2(Integer var0) {
      if (var0 >= 0 && var0 <= 65535) {
         return var0 & 65535;
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.intValue()), "UInt16"
            )
         );
      }
   }

   protected static int u9(Long var0) {
      if (var0 >= -2147483648L && var0 <= 2147483647L) {
         return (int)var0.longValue();
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.longValue()), "Int32"
            )
         );
      }
   }

   protected static long h0(Long var0) {
      if (var0 >= 0L && var0 <= 4294967295L) {
         return var0 & 4294967295L;
      } else {
         throw new OverflowException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Value '{0}' was either too large or too small for {1}.", com.aspose.slides.ms.System.Xml.f4.n5(var0.longValue()), "UInt32"
            )
         );
      }
   }

   protected static com.aspose.slides.ms.System.j5 y1(String var0) {
      return r6o.n5(new r6o(var0, 255));
   }

   protected static com.aspose.slides.ms.System.w1 a0(String var0) {
      return r6o.l6(new r6o(var0, 255));
   }
}
