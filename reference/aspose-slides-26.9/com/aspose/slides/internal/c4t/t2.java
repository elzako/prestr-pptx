package com.aspose.slides.internal.c4t;

import com.aspose.slides.ms.System.v4;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.security.InvalidParameterException;

public final class t2 implements v4 {
   public static final float[] n5 = new float[]{18.0F, 6.0F};
   public static final float[] l6 = new float[]{9.0F, 6.0F, 3.0F, 6.0F};
   public static final float[] k5 = new float[]{9.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F};
   public static final float[] u3 = new float[]{3.0F, 3.0F};
   static final Stroke a6 = new BasicStroke(0.0F);
   static final Color u9 = new Color(0, 0, 0, 0);
   Stroke h0;
   Paint c8;
   u3 t2 = null;
   boolean s7 = false;

   public static Stroke n5(int var0, int var1) {
      float[] var2 = null;
      switch (var0 & 15) {
         case 0:
         case 6:
         default:
            var2 = null;
            break;
         case 1:
            var2 = (float[])n5.clone();
            break;
         case 2:
            var2 = (float[])u3.clone();
            break;
         case 3:
            var2 = (float[])l6.clone();
            break;
         case 4:
            var2 = (float[])k5.clone();
            break;
         case 5:
            return new c8();
      }

      byte var3 = 1;
      byte var4 = 1;
      if ((var0 & 65536) == 0 && var1 < 2) {
         var3 = 0;
         var4 = 2;
      } else {
         switch (var0 & 3840) {
            case 0:
            default:
               var3 = 1;
               break;
            case 256:
               var3 = 2;
               break;
            case 512:
               var3 = 0;
         }

         switch (var0 & 61440) {
            case 0:
            default:
               var4 = 1;
               break;
            case 4096:
               var4 = 2;
               break;
            case 8192:
               var4 = 0;
         }

         if (var1 == 0) {
            var1 = 1;
         }
      }

      return new BasicStroke(var1, var3, var4, 10.0F, var2, 0.0F);
   }

   public t2(Stroke var1, Color var2) {
      if (var1 instanceof c8) {
         this.c8 = u9;
      } else if (var1 instanceof BasicStroke) {
         BasicStroke var3 = (BasicStroke)var1;
         if (var3.getLineWidth() > 1.0F) {
            this.s7 = true;
         }
      }

      this.h0 = var1;
      this.c8 = var2;
   }

   public t2(int var1, int var2, com.aspose.slides.internal.d2n.n5 var3, int[] var4, n5 var5) throws com.aspose.slides.internal.p7x.l6 {
      if ((var1 & 15) == 5) {
         this.h0 = new c8();
         this.c8 = u9;
      } else {
         float var6 = 10.0F;
         float[] var7 = null;
         switch (var1 & 15) {
            case 0:
            case 5:
            case 6:
            default:
               var7 = null;
               break;
            case 1:
               var7 = (float[])n5.clone();
               break;
            case 2:
               var7 = (float[])u3.clone();
               break;
            case 3:
               var7 = (float[])l6.clone();
               break;
            case 4:
               var7 = (float[])k5.clone();
               break;
            case 7:
               if (var4 == null) {
                  throw new InvalidParameterException("PS_USERSTYLE pen require not null styleEntries array.");
               }

               var7 = new float[var4.length];
               float var8 = var2 > 0 ? var2 : 1.0F;

               for (int var9 = 0; var9 < var4.length; var9++) {
                  var7[var9] = var4[var9] / var8;
               }
         }

         byte var12 = 1;
         byte var14 = 1;
         if ((var1 & 65536) == 0 && var2 < 2) {
            this.c8 = var3.l6();
            var2 = 1;
            var12 = 0;
            var14 = 2;
         } else {
            this.s7 = true;
            switch (var3.k5()) {
               case 0:
                  this.c8 = var3.l6();
                  break;
               case 1:
                  this.h0 = a6;
                  this.c8 = u9;
                  break;
               case 2:
               case 3:
               case 4:
               default:
                  this.t2 = var3.n5();
                  break;
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
                  if (var5 == null) {
                     throw new InvalidParameterException("Pattern == null on creating pattern based pen.");
                  }

                  this.t2 = new k5(var5.n5());
            }

            if (var7 != null && var2 > 0) {
               for (int var10 = 0; var10 < var7.length; var10++) {
                  var7[var10] *= var2;
               }
            }

            switch (var1 & 3840) {
               case 0:
               default:
                  var12 = 1;
                  break;
               case 256:
                  var12 = 2;
                  break;
               case 512:
                  var12 = 0;
            }

            switch (var1 & 61440) {
               case 0:
               default:
                  var14 = 1;
                  break;
               case 4096:
                  if (var12 == 0) {
                     var14 = 0;
                     var6 = 1.0F;
                  } else {
                     var14 = 2;
                  }
                  break;
               case 8192:
                  var14 = 0;
            }
         }

         if (var2 == 0) {
            var2 = 1;
         }

         this.h0 = new BasicStroke(var2, var12, var14, var6, var7, 0.0F);
      }
   }

   public void n5(com.aspose.slides.internal.o6t.k5 var1) {
      Graphics2D var2 = var1.z1();
      if (!(this.h0 instanceof BasicStroke)) {
         var2.setStroke(this.h0);
      } else {
         BasicStroke var3 = (BasicStroke)this.h0;
         float[] var4 = var3.getDashArray();
         float var5 = var3.getLineWidth();
         if (!this.s7) {
            if (var4 != null) {
               AffineTransform var6 = var2.getTransform();
               float var7 = (float)Math.sqrt(Math.abs(var6.getDeterminant()));
               if (var7 < 1.0E-4F) {
                  var7 = 1.0E-4F;
               }

               var5 = 1.0F / var7;

               for (int var8 = 0; var8 < var4.length; var8++) {
                  var4[var8] *= var5;
               }
            }

            if (var1.q0().z1 != null) {
               var5 *= (float)Math.sqrt(Math.abs(var1.q0().z1.getDeterminant()));
            }
         }

         var2.setStroke(new BasicStroke(var5, var3.getEndCap(), var3.getLineJoin(), var1.q0().w1, var4, var3.getDashPhase()));
      }

      if (this.t2 != null) {
         this.t2.n5(var1);
      } else if (this.c8 != null) {
         if (this.c8 instanceof Color) {
            var2.setPaint(var1.k5((Color)this.c8));
         } else {
            var2.setPaint(this.c8);
         }
      }
   }

   public boolean n5() {
      return this.s7;
   }

   public Paint l6() {
      return this.c8;
   }

   @Override
   public Object deepClone() {
      t2 var1 = new t2(this.h0, (Color)this.c8);
      if (this.c8 instanceof Color) {
         var1.c8 = new Color(((Color)this.c8).getRed(), ((Color)this.c8).getGreen(), ((Color)this.c8).getBlue(), ((Color)this.c8).getAlpha());
      }

      var1.t2 = this.t2 != null ? (u3)this.t2.deepClone() : null;
      var1.s7 = this.s7;
      return var1;
   }
}
