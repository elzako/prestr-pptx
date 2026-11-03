package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j3;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

@j3
public final class n3 implements IDisposable, com.aspose.slides.ms.System.v4, Cloneable {
   private int n5 = 3;
   private final y4 l6;
   private String k5 = null;
   private float u3 = 0.0F;
   private Font a6;
   private byte u9 = 1;
   private boolean h0 = false;
   private String c8;
   private boolean t2 = false;

   public n3(n3 var1, int var2) {
      this.a6 = var1.z1().deriveFont(com.aspose.slides.internal.r5w.k5.n5(var1.z1().getAttributes(), var2, true));
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.u9 = var1.u9;
      this.k5 = var1.h0();
      this.h0 = var1.u3();
      this.u3 = var1.u3;
   }

   public n3(y4 var1, float var2) {
      this(var1, var2, 0, 3, (byte)1, false);
   }

   public n3(String var1, float var2) {
      this(var1, var2, 0, 3, (byte)1, n5(var1));
   }

   public static n3 n5(y4 var0, float var1, int var2) {
      return new n3(var0, var1, var2, 3, (byte)1, false);
   }

   public static n3 n5(String var0, float var1, int var2) {
      return new n3(var0, var1, var2, 3, (byte)1, n5(var0));
   }

   public n3(y4 var1, float var2, int var3, int var4) {
      this(var1, var2, var3, var4, (byte)1, false);
   }

   public n3(String var1, float var2, int var3, int var4) {
      this(var1, var2, var3, var4, (byte)1, n5(var1));
   }

   public n3(String var1, float var2, int var3, int var4, byte var5) {
      this(var1, var2, var3, var4, var5, n5(var1));
   }

   public n3(y4 var1, float var2, int var3, int var4, byte var5, boolean var6) {
      if (var1 == null) {
         throw new ArgumentNullException("family");
      }

      this.l6 = var1;
      this.n5(this.l6, var2, var3, var4, var5, var6, false);
   }

   public n3(String var1, float var2, int var3, int var4, byte var5, boolean var6) {
      this(com.aspose.slides.internal.f3l.k5.l6(var1), var2, var3, var4, var5, var6);
   }

   n3(String var1, float var2, String var3) {
      this(var1, var2);
      this.c8 = var3;
   }

   public boolean n5() {
      return this.z1().isBold();
   }

   public y4 l6() {
      return this.l6;
   }

   public byte k5() {
      return this.u9;
   }

   public boolean u3() {
      return this.h0;
   }

   public int a6() {
      return (int)Math.ceil(this.e2());
   }

   public boolean u9() {
      return this.z1().isItalic();
   }

   public String h0() {
      return this.k5;
   }

   public float c8() {
      return this.u3;
   }

   public float t2() {
      return this.n5 == 3 ? this.c8() : (float)com.aspose.slides.internal.r5w.n5.n5(this.y4(), 3, (double)this.c8());
   }

   public boolean s7() {
      try {
         if ((Boolean)this.z1().getAttributes().get(TextAttribute.STRIKETHROUGH) == TextAttribute.STRIKETHROUGH_ON) {
            return true;
         }
      } catch (Exception var2) {
      }

      return false;
   }

   public int x8() {
      byte var1 = 0;
      if (this.n5()) {
         var1 |= 1;
      }

      if (this.u9()) {
         var1 |= 2;
      }

      if (this.n3()) {
         var1 |= 4;
      }

      if (this.s7()) {
         var1 |= 8;
      }

      return var1;
   }

   public boolean n3() {
      try {
         if ((Integer)this.z1().getAttributes().get(TextAttribute.UNDERLINE) == TextAttribute.UNDERLINE_ON) {
            return true;
         }
      } catch (Exception var2) {
      }

      return false;
   }

   public int y4() {
      return this.n5;
   }

   @Override
   public Object deepClone() {
      return this.t9();
   }

   @Override
   public void dispose() {
      this.a6 = null;
      this.t2 = true;
   }

   @Override
   public boolean equals(Object obj) {
      n3 var2 = obj instanceof n3 ? (n3)obj : null;
      return var2 != null && this.z1().equals(var2.z1());
   }

   @Override
   public int hashCode() {
      return this.z1().hashCode();
   }

   public float e2() {
      return this.n5(com.aspose.slides.internal.r5w.n5.a6());
   }

   public float n5(z1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("graphics");
      }

      float var2 = var1.x8();
      int var3 = var1.e2();
      if (var3 != 2 && var3 != 1 && this.n5 != 2 && this.n5 != 0) {
         var2 = (float)com.aspose.slides.internal.r5w.n5.n5(2, var1.e2(), (double)var1.x8());
      }

      return this.n5(var2);
   }

   public float n5(float var1) {
      return (float)(this.t4() * com.aspose.slides.internal.r5w.n5.n5(this.n5, 4, (double)this.u3) * var1);
   }

   @Override
   public String toString() {
      return "[Font: Name=" + this.h0() + ", Size=" + this.c8() + ", Style=" + this.x8() + ", Units=" + this.y4() + "]";
   }

   protected Object t9() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   public Font z1() {
      if (this.t2) {
         throw new ArgumentException("Parameter is invalid");
      } else {
         return this.a6;
      }
   }

   public static n3 n5(n3 var0, Map var1) {
      Font var2 = n5(var0);
      n3 var3 = new n3((n3)var0.deepClone(), var0.x8());
      var3.a6 = var2.deriveFont(var1);
      return var3;
   }

   public static n3 n5(n3 var0, float var1, int var2) {
      n3 var3 = (n3)var0.deepClone();
      var3.u3 = var1;
      var3.n5 = var2;
      var3.a6 = var0.a6.deriveFont(var1);
      return var3;
   }

   private void n5(y4 var1, float var2, int var3, int var4, byte var5, boolean var6, boolean var7) {
      if (Float.isNaN(var2) || Float.isInfinite(var2) || var2 <= 0.0F) {
         throw new ArgumentException("Parameter 'emSize' is invalid");
      }

      if (var4 == 1) {
         throw new ArgumentException("Parameter 'unit' cannot be Graphics.Display");
      }

      if (!var1.c8(var3) && !com.aspose.slides.internal.t9p.k5.f5) {
         throw new ArgumentException("Font '" + var1.a6() + "' does not support style '" + com.aspose.slides.ms.System.d5.getName(e2.class, var3) + "'");
      }

      this.n5 = var4;
      this.u9 = var5;
      this.h0 = var6;
      HashMap var8 = new HashMap();
      var8.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      var8.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_REGULAR);
      this.u3 = var2;
      double var9 = this.u3;
      if (this.n5 != 2) {
         var9 = com.aspose.slides.internal.r5w.n5.n5(this.n5, 2, (double)this.u3);
      }

      var8.put(TextAttribute.SIZE, new Float(var9));
      Map var11 = com.aspose.slides.internal.r5w.k5.n5(var8, var3, false);
      this.a6 = var1.s7(var3).deriveFont(var11);
      this.k5 = this.a6.getName();
   }

   private static boolean n5(String var0) {
      return var0 != null && var0.length() > 0 && var0.charAt(0) == '@';
   }

   private float t4() {
      return (float)((double)this.l6().h0(this.x8()) / this.l6().u9(this.x8()));
   }

   public static Font n5(n3 var0) {
      return var0 == null ? null : var0.z1();
   }
}
