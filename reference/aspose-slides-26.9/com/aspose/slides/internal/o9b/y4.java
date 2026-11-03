package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class y4 implements Cloneable {
   private static y4 n5;
   private static y4 l6;
   private static y4 k5;
   private static final com.aspose.slides.internal.v7u.l6 u3 = new com.aspose.slides.internal.v7u.l6();
   private static final Container a6 = new Container();
   private com.aspose.slides.internal.v7u.n5 u9;
   private String h0;
   private Map<Integer, FontMetrics> c8 = new HashMap<>();
   private Map<Integer, com.aspose.slides.internal.q9r.k5> t2 = new HashMap<>();
   private Font[] s7;
   private boolean x8;

   public y4(String var1) {
      this(var1, null);
   }

   public y4(String var1, com.aspose.slides.internal.v7u.n5 var2) {
      this.n5(var1, var2);
   }

   public static y4[] n5() {
      return u3.n5();
   }

   public static y4 l6() {
      if (n5 == null) {
         n5 = com.aspose.slides.internal.f3l.u3.n5(2);
      }

      return (y4)n5.h0();
   }

   public static y4 k5() {
      if (l6 == null) {
         l6 = com.aspose.slides.internal.f3l.u3.n5(1);
      }

      return (y4)l6.h0();
   }

   public static y4 u3() {
      if (k5 == null) {
         k5 = com.aspose.slides.internal.f3l.u3.n5(0);
      }

      return (y4)k5.h0();
   }

   public String a6() {
      return this.h0;
   }

   public void u9() {
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      } else {
         return !(obj instanceof y4) ? false : d1.n5(this.a6(), ((y4)obj).a6(), true) == 0;
      }
   }

   @Override
   public int hashCode() {
      return this.a6().toLowerCase().hashCode();
   }

   public String n5(int var1) {
      try {
         com.aspose.slides.internal.x7n.l6 var2 = new com.aspose.slides.internal.x7n.l6(var1);
         Locale var3 = com.aspose.slides.internal.x7n.l6.n5(var2);
         return this.s7[0].getFamily(var3);
      } catch (Exception var4) {
         return this.a6();
      }
   }

   @Override
   public String toString() {
      return d1.n5("[{0}: Name={1}]",new Object[]{ this.getClass().getName(), this.a6()});
   }

   private void n5(String var1, com.aspose.slides.internal.v7u.n5 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("name");
      }

      if (var2 == null) {
         this.u9 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f3l.k5.n5(), u3);
      } else {
         this.u9 = var2;
      }

      Object var3 = null;

      while (true) {
         var3 = this.u9.l6().l6(var1);
         if (var3 != null) {
            break;
         }

         String var4 = com.aspose.slides.internal.f3l.h0.n5(var1);
         if (var1.equals(var4)) {
            break;
         }

         var1 = var4;
      }

      if (var3 == null) {
         throw new ArgumentException(d1.n5("FontFamily '{0}' not found", new Object[]{var1}), var1);
      }

      if (((Object[])var3)[0] == null) {
         throw new ArgumentException(d1.n5("FontFamily '{0}' not supported", new Object[]{var1}), var1);
      }

      this.s7 = (Font[])var3;
      this.h0 = this.s7[0].getFamily();
      String var6 = this.h0.toLowerCase();
      this.x8 = "sansserif".equals(var6) || "serif".equals(var6) || "monospaced".equals(var6) || "dialog".equals(var6) || "dialoginput".equals(var6);
   }

   private FontMetrics x8(int var1) {
      FontMetrics var2 = this.c8.get(var1);
      if (var2 == null) {
         Font var3 = this.s7(var1);
         Map var4 = com.aspose.slides.internal.r5w.k5.n5(var3.getAttributes(), var1, true);
         var4.put(TextAttribute.SIZE, (float)(this.u9(var1) << 1));
         var2 = a6.getFontMetrics(var3.deriveFont(var4));
         this.c8.put(var1, var2);
      }

      return var2;
   }

   public com.aspose.slides.internal.q9r.k5 l6(int var1) {
      com.aspose.slides.internal.q9r.k5 var2 = this.t2.get(var1);
      if (var2 == null) {
         var2 = this.u9.l6().n5(this.a6(), var1);
         this.t2.put(var1, var2);
      }

      return var2;
   }

   private com.aspose.slides.internal.q9r.u3 c8() {
      return this.u9.l6().n5(this.a6());
   }

   public int k5(int var1) {
      com.aspose.slides.internal.q9r.k5 var2 = this.l6(var1);
      return var2 == null ? this.u3(var1) : var2.u9();
   }

   public int u3(int var1) {
      return this.x8(var1).getAscent() >> 1;
   }

   public int a6(int var1) {
      com.aspose.slides.internal.q9r.k5 var2 = this.l6(var1);
      return var2 == null ? this.n3(var1) : var2.h0();
   }

   private int n3(int var1) {
      return this.x8(var1).getDescent() >> 1;
   }

   public int u9(int var1) {
      com.aspose.slides.internal.q9r.k5 var2 = this.l6(var1);
      return var2 == null ? this.y4(var1) : var2.a6();
   }

   private int y4(int var1) {
      return 2048;
   }

   public int h0(int var1) {
      com.aspose.slides.internal.q9r.k5 var2 = this.l6(var1);
      return var2 == null ? this.e2(var1) : var2.c8();
   }

   private int e2(int var1) {
      return this.x8(var1).getHeight() >> 1;
   }

   public boolean c8(int var1) {
      if (this.x8) {
         return this.t2(var1);
      }

      com.aspose.slides.internal.q9r.k5 var2 = this.l6(var1);
      boolean var3 = var2 != null;
      if (!var3) {
         com.aspose.slides.internal.q9r.u3 var4 = this.c8();
         if (var4 == null || var4.n5() == 0) {
            return this.t2(var1);
         }

         if (var4.l6() == 0) {
            return true;
         }
      }

      return var3;
   }

   public boolean t2(int var1) {
      return this.s7(var1) != null;
   }

   Font s7(int var1) {
      Font var2 = this.s7[var1 & 3];
      if (var2 == null) {
         var2 = this.s7[0];
      }

      return var2;
   }

   protected Object h0() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   static {
      Object var0 = null;
      Object var1 = null;
      Object var2 = null;
      var0 = com.aspose.slides.internal.f3l.u3.n5(2);
      var1 = com.aspose.slides.internal.f3l.u3.n5(1);
      var2 = com.aspose.slides.internal.f3l.u3.n5(0);
      n5 = (y4)var0;
      l6 = (y4)var1;
      k5 = (y4)var2;
   }
}
