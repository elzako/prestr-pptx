package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlSchemaException;

public class h6 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(Object.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(Object[].class);
   private u1s[] z1;

   @Override
   public e3m l6(j9e var1) {
      return p4l.n5(var1);
   }

   public h6(u1s[] var1) {
      this.z1 = var1;
   }

   @Override
   public int l6(Object var1, Object var2) {
      e4j var3 = com.aspose.slides.internal.v6g.k5.n5(var1, e4j.class);
      e4j var4 = com.aspose.slides.internal.v6g.k5.n5(var2, e4j.class);
      if (var3 != null && var4 != null) {
         u1s var5 = var3.n5();
         u1s var6 = var4.n5();
         if (var5 == var6) {
            v5 var7 = var5.b3();
            return var7.l6(var3.l6(), var4.l6());
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @Override
   public com.aspose.slides.ms.System.y8 s7() {
      return e2;
   }

   @Override
   public int n3() {
      return 10;
   }

   @Override
   public c2 h0() {
      return x8;
   }

   @Override
   public com.aspose.slides.ms.System.y8 t4() {
      return t9;
   }

   @Override
   public int q0() {
      return 24;
   }

   public final u1s[] m3() {
      return this.z1;
   }

   public final boolean z8() {
      for (int var1 = 0; var1 < this.z1.length; var1++) {
         if (this.z1[var1].b3().x8() == 1) {
            return false;
         }
      }

      return true;
   }

   public final boolean n5(t4 var1) {
      for (int var2 = 0; var2 < this.z1.length; var2++) {
         if (var1.n5(this.z1[var2].b3())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      u1s var5 = null;
      var4[0] = null;
      String[] var6 = new String[]{var1};
      RuntimeException var7 = x8.n5(var6, this);
      var1 = var6[0];
      if (var7 != null) {
         return var7;
      }

      for (int var8 = 0; var8 < this.z1.length; var8++) {
         var7 = this.z1[var8].b3().n5(var1, var2, var3, var4);
         if (var7 == null) {
            var5 = this.z1[var8];
            break;
         }
      }

      if (var5 == null) {
         return new XmlSchemaException("The value '{0}' is not valid according to any of the memberTypes of the union.", var1);
      }

      var4[0] = new e4j(var5, var4[0]);
      var7 = x8.l6(var4[0], this);
      return var7 != null ? var7 : null;
   }

   @Override
   public RuntimeException n5(Object var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      var4[0] = null;
      String var5 = com.aspose.slides.internal.v6g.k5.n5(var1, String.class);
      if (var5 != null) {
         return this.n5(var5, var2, var3, var4);
      }

      Object var6 = null;
      u1s var7 = null;

      for (int var8 = 0; var8 < this.z1.length; var8++) {
         Object[] var9 = new Object[]{var6};
         boolean var10 = this.z1[var8].b3().n5(var1, var2, var3, var9) == null;
         var6 = var9[0];
         if (var10) {
            var7 = this.z1[var8];
            break;
         }
      }

      if (var6 == null) {
         return new XmlSchemaException("The value '{0}' is not valid according to any of the memberTypes of the union.", var1.toString());
      }

      RuntimeException var11;
      try {
         if (this.e2()) {
            String var16 = (String)this.c8().n5(var6, com.aspose.slides.internal.v6g.k5.n5(String.class), var3);
            String[] var18 = new String[]{var16};
            var11 = x8.n5(var18, this);
            var16 = var18[0];
            if (var11 != null) {
               return var11;
            }
         }

         var4[0] = new e4j(var7, var6);
         if (this.t9()) {
            var11 = x8.l6(var4[0], this);
            if (var11 != null) {
               return var11;
            }
         }

         return null;
      } catch (ClassCastException var12) {
         var11 = var12;
      } catch (FormatException var13) {
         var11 = var13;
      } catch (OverflowException var14) {
         var11 = var14;
      } catch (ArgumentException var15) {
         var11 = var15;
      }

      return var11;
   }
}
