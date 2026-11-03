package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlSchemaException;

public class m3 extends a0 {
   private t4 e2;
   private int t9;

   @Override
   public e3m l6(j9e var1) {
      u1s var2 = null;
      l9 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, l9.class);
      u1s var4;
      if (var3 != null) {
         do {
            var4 = com.aspose.slides.internal.v6g.k5.n5(var3.y1(), u1s.class);
            if (var4 != null) {
               break;
            }

            var3 = com.aspose.slides.internal.v6g.k5.n5(var3.y1(), l9.class);
         } while (var3 != null && var3 != l9.n5());
      } else {
         var4 = com.aspose.slides.internal.v6g.k5.n5(var1, u1s.class);
      }

      if (var4 != null) {
         do {
            e5a var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(), e5a.class);
            if (var5 != null) {
               var2 = var5.u9();
               break;
            }

            var4 = com.aspose.slides.internal.v6g.k5.n5(var4.y1(), u1s.class);
         } while (var4 != null && var4 != n5());
      }

      if (var2 == null) {
         var2 = k5(var1.b3().n3());
      }

      return q5.n5(var2.z7());
   }

   public m3(t4 var1, int var2) {
      this.e2 = var1;
      this.t9 = var2;
   }

   @Override
   public int l6(Object var1, Object var2) {
      com.aspose.slides.ms.System.u3 var3 = com.aspose.slides.internal.v6g.k5.k5(var1, com.aspose.slides.ms.System.u3.class);
      com.aspose.slides.ms.System.u3 var4 = com.aspose.slides.internal.v6g.k5.k5(var2, com.aspose.slides.ms.System.u3.class);
      int var5 = var3.a6();
      if (var5 != var4.a6()) {
         return -1;
      }

      x6[] var6 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(var3), x6[].class);
      if (var6 == null) {
         for (int var10 = 0; var10 < var3.a6(); var10++) {
            if (this.e2.l6(var3.k5(var10), var4.k5(var10)) != 0) {
               return -1;
            }
         }

         return 0;
      } else {
         x6[] var7 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(var4), x6[].class);

         for (int var8 = 0; var8 < var6.length; var8++) {
            j9e var9 = var6[var8].l6();
            if (var9 != var7[var8].l6() || !var9.b3().n5(var6[var8].u3(), var7[var8].u3())) {
               return -1;
            }
         }

         return 0;
      }
   }

   @Override
   public com.aspose.slides.ms.System.y8 s7() {
      return this.t4();
   }

   @Override
   public int t2() {
      return this.e2.t2();
   }

   @Override
   public com.aspose.slides.ms.System.y8 t4() {
      return this.e2.t4();
   }

   @Override
   public c2 h0() {
      return t2;
   }

   @Override
   public int n3() {
      return this.e2.n3();
   }

   @Override
   public int q0() {
      return 63;
   }

   @Override
   public RuntimeException n5(Object var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      String var5 = com.aspose.slides.internal.v6g.k5.n5(var1, String.class);
      var4[0] = null;
      if (var5 != null) {
         return this.n5(var5, var2, var3, var4);
      }

      RuntimeException var16;
      try {
         Object var6 = this.c8().n5(var1, this.s7(), var3);
         com.aspose.slides.ms.System.u3 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.ms.System.u3.class);
         boolean var8 = this.e2.e2();
         boolean var9 = this.e2.t9();
         c2 var10 = this.e2.h0();
         e3m var11 = this.e2.c8();

         for (int var12 = 0; var12 < var7.a6(); var12++) {
            Object var13 = var7.k5(var12);
            if (var8) {
               String var14 = (String)var11.n5(var13, com.aspose.slides.internal.v6g.k5.n5(String.class), var3);
               String[] var15 = new String[]{var14};
               var16 = var10.n5(var15, this.e2);
               var14 = var15[0];
               if (var16 != null) {
                  return var16;
               }
            }

            if (var9) {
               var16 = var10.l6(var13, this.e2);
               if (var16 != null) {
                  return var16;
               }
            }
         }

         if (this.e2()) {
            String var21 = (String)this.c8().n5(var6, com.aspose.slides.internal.v6g.k5.n5(String.class), var3);
            String[] var24 = new String[]{var21};
            var16 = t2.n5(var24, this);
            var21 = var24[0];
            if (var16 != null) {
               return var16;
            }
         }

         if (this.t9()) {
            var16 = t2.l6(var6, this);
            if (var16 != null) {
               return var16;
            }
         }

         var4[0] = var6;
         return null;
      } catch (ArgumentException var17) {
         var16 = var17;
      } catch (FormatException var18) {
         var16 = var18;
      } catch (ClassCastException var19) {
         var16 = var19;
      } catch (OverflowException var20) {
         var16 = var20;
      }

      return var16;
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      String[] var5 = new String[]{var1};
      RuntimeException var6 = t2.n5(var5, this);
      var1 = var5[0];
      if (var6 != null) {
         return var6;
      }

      ArrayList var7 = new ArrayList();
      com.aspose.slides.ms.System.u3 var13;
      if (this.e2.x8() == 2) {
         Object var8 = null;
         String[] var9 = com.aspose.slides.ms.System.Xml.f4.c4(var1);

         for (int var10 = 0; var10 < var9.length; var10++) {
            Object[] var11 = new Object[]{var8};
            var6 = this.e2.n5(var9[var10], var2, var3, var11);
            var8 = var11[0];
            if (var6 != null) {
               return var6;
            }

            e4j var12 = (e4j)var8;
            var7.addItem(new x6(var12.n5(), var12.l6(), var3));
         }

         var13 = var7.toArray(com.aspose.slides.internal.v6g.k5.n5(x6.class));
      } else {
         String[] var18 = com.aspose.slides.ms.System.Xml.f4.c4(var1);

         for (int var19 = 0; var19 < var18.length; var19++) {
            var6 = this.e2.n5(var18[var19], var2, var3, var4);
            if (var6 != null) {
               return var6;
            }

            var7.addItem(var4[0]);
         }

         var13 = var7.toArray(this.e2.s7());
      }

      if (var7.size() < this.t9) {
         return new XmlSchemaException("The attribute value cannot be empty.", com.aspose.slides.ms.System.d1.n5);
      }

      var6 = t2.l6(var13, this);
      if (var6 != null) {
         return var6;
      }

      var4[0] = var13;
      return null;
   }
}
