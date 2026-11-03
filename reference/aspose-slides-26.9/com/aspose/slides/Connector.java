package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;

public class Connector extends GeometryShape implements IConnector {
   private final Shape$n5 l6 = new Connector$1(this);
   private final Shape$n5 k5 = new Connector$2(this);
   private Shape u3 = null;
   private Shape u9 = null;
   private long h0;
   private long e2;
   private com.aspose.slides.internal.o9b.w1 t9 = com.aspose.slides.internal.o9b.w1.n5.u3();
   private com.aspose.slides.internal.o9b.w1 z1 = com.aspose.slides.internal.o9b.w1.n5.u3();
   private long t4;
   private long q0;
   private int z3 = -1;
   private int m1 = -1;
   static final Dictionary<Integer, Integer> n5 = n5(1, 96, 97, 98, 99, 100, 101, 102, 103, 104);

   @Override
   public final IConnectorLock getShapeLock() {
      return (IConnectorLock)super.getShapeLock();
   }

   @Override
   public final IConnectorLock getConnectorLock() {
      return (IConnectorLock)super.getShapeLock();
   }

   @Override
   public int getShapeType() {
      return super.getShapeType();
   }

   @Override
   public void setShapeType(int value) {
      if (!n5.containsKey(value)) {
         throw new PptxEditException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"Incorrect ShapeType value for Connector specified: ", com.aspose.slides.ms.System.s3.n5(ShapeType.class, value)})
         );
      }

      super.setShapeType(value);
      this.x8();
   }

   @Override
   public final IShape getStartShapeConnectedTo() {
      return this.u3;
   }

   @Override
   public final void setStartShapeConnectedTo(IShape value) {
      if (this.n5(value)) {
         this.x8();
      }
   }

   @Override
   public final IShape getEndShapeConnectedTo() {
      return this.u9;
   }

   @Override
   public final void setEndShapeConnectedTo(IShape value) {
      if (this.l6(value)) {
         this.x8();
      }
   }

   @Override
   public final long getStartShapeConnectionSiteIndex() {
      return this.h0;
   }

   @Override
   public final void setStartShapeConnectionSiteIndex(long value) {
      if (this.n5(value)) {
         this.x8();
      }
   }

   @Override
   public final long getEndShapeConnectionSiteIndex() {
      return this.e2;
   }

   @Override
   public final void setEndShapeConnectionSiteIndex(long value) {
      if (this.l6(value)) {
         this.x8();
      }
   }

   @Override
   public final void reroute() {
      if (this.u9 != null && this.u3 != null) {
         com.aspose.slides.internal.o9b.w1[] var1 = this.u3.e5().c8();
         com.aspose.slides.internal.o9b.w1[] var2 = this.u9.e5().c8();
         long var3 = 0L;
         long var5 = 0L;
         double var7 = Double.MAX_VALUE;

         for (long var9 = 0L; (var9 & 4294967295L) < var1.length; var9++) {
            com.aspose.slides.internal.o9b.w1 var11 = var1[(int)var9].u3();

            for (long var12 = 0L; (var12 & 4294967295L) < var2.length; var12++) {
               com.aspose.slides.internal.o9b.w1 var14 = var2[(int)var12].u3();
               double var15 = n5(var11.u3(), var14.u3());
               if (var15 < var7) {
                  var7 = var15;
                  var3 = var9;
                  var5 = var12;
               }
            }
         }

         this.h0 = var3;
         this.e2 = var5;
         this.x8();
      }
   }

   final d9l n5() {
      return (d9l)super.u9();
   }

   Connector(r0g parentImmediate) {
      super(parentImmediate, new d9l(), new ConnectorLock());
      this.n5(new y0k(this));
   }

   @Override
   o4f R_() {
      this.x8();
      return super.R_();
   }

   final boolean n5(IShape var1) {
      if (var1 != this.u3) {
         if (var1 != null && var1.getConnectionSiteCount() == 0) {
            throw new ArgumentException("Connected shape doesn't has any connection sites (IShape.ConnectionSiteCount equals zero)");
         }

         if (this.u3 != null) {
            this.u3.y4.n5(this.l6);
            this.h0 = 0L;
         }

         this.u3 = (Shape)var1;
         if (var1 != null) {
            this.u3.y4.l6(this.l6);
            if ((this.h0 & 4294967295L) >= var1.getConnectionSiteCount()) {
               this.h0 = 0L;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   final boolean n5(long var1) {
      if ((this.h0 & 4294967295L) != (var1 & 4294967295L)) {
         if (this.u3 != null && this.u3.getConnectionSiteCount() <= (var1 & 4294967295L)) {
            throw new ArgumentException("Index of connection site must be less than StartShapeConnectedTo.ConnectionSiteCount");
         }

         this.h0 = var1;
         return true;
      } else {
         return false;
      }
   }

   final boolean l6(IShape var1) {
      if (var1 != this.u9) {
         if (var1 != null && var1.getConnectionSiteCount() == 0) {
            throw new ArgumentException("Connected shape doesn't has any connection sites (IShape.ConnectionSiteCount equals zero)");
         }

         if (this.u9 != null) {
            this.u9.y4.n5(this.k5);
         }

         this.u9 = (Shape)var1;
         if (var1 != null) {
            this.u9.y4.l6(this.k5);
            if ((this.e2 & 4294967295L) >= var1.getConnectionSiteCount()) {
               this.e2 = 0L;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   final boolean l6(long var1) {
      if ((this.e2 & 4294967295L) != (var1 & 4294967295L)) {
         if (this.u9 != null && this.u9.getConnectionSiteCount() <= (var1 & 4294967295L)) {
            throw new ArgumentException("Index of connection site must be less than EndShapeConnectedTo.ConnectionSiteCount");
         }

         this.e2 = var1;
         return true;
      } else {
         return false;
      }
   }

   final void k5() {
      n5(this.u3, this.h0).n5(this.t9);
      n5(this.u9, this.e2).n5(this.z1);
      this.y4();
   }

   private void x8() {
      if ((this.u3 != null ? this.u3.t2() : 0L) != this.t4
         || (this.u9 != null ? this.u9.t2() : 0L) != this.q0
         || (this.h0 & 4294967295L) != this.z3
         || (this.e2 & 4294967295L) != this.m1) {
         this.y4();
         boolean var1 = false;
         boolean var2 = false;
         boolean[] var3 = new boolean[]{false};
         boolean[] var4 = new boolean[]{false};
         Connector$l6 var5 = this.n5(var3, var4).z1();
         var1 = var3[0];
         var2 = var4[0];
         if (com.aspose.slides.internal.o9b.w1.l6(var5.s7(), this.t9) || com.aspose.slides.internal.o9b.w1.l6(var5.x8(), this.z1)) {
            if (var1 && var2) {
               if (this.m3()) {
                  this.n5(var5.z1());
               } else {
                  float[] var16 = this.u3.e5().t2();
                  float[] var17 = this.u9.e5().t2();
                  if (var16 != null && var16.length > (this.h0 & 4294967295L) && var17 != null && var17.length > (this.e2 & 4294967295L)) {
                     short var18 = 0;
                     float var9 = this.u3.p8().getRotation() % 360.0F;
                     if (var9 < 0.0F) {
                        var9 += 360.0F;
                     }

                     if (var9 < 45.0F) {
                        var18 = 0;
                     } else if (var9 < 135.0F) {
                        var18 = 90;
                     } else if (var9 < 225.0F) {
                        var18 = 180;
                     } else if (var9 < 315.0F) {
                        var18 = 270;
                     }

                     float var10 = var16[(int)this.h0] + var18;
                     short var11 = 0;
                     float var12 = this.u9.p8().getRotation() % 360.0F;
                     if (var12 < 0.0F) {
                        var12 += 360.0F;
                     }

                     if (var12 < 45.0F) {
                        var11 = 0;
                     } else if (var12 < 135.0F) {
                        var11 = 90;
                     } else if (var12 < 225.0F) {
                        var11 = 180;
                     } else if (var12 < 315.0F) {
                        var11 = 270;
                     }

                     float var13 = var17[(int)this.e2] + var11;
                     this.n5(var5.z1(), var10, var13);
                  }
               }
            } else if (var1 || var2) {
               float var6 = 0.0F;
               float var7 = 0.0F;
               if (var1) {
                  var6 = var5.n5() - this.t9.l6();
                  var7 = var5.l6() - this.t9.k5();
                  var5.s7().n5(this.t9);
               } else if (var2) {
                  var6 = var5.k5() - this.z1.l6();
                  var7 = var5.u3() - this.z1.k5();
                  var5.x8().n5(this.z1);
               }

               if (com.aspose.slides.ms.System.q1.n5(var6) > 1.0E-4 || com.aspose.slides.ms.System.q1.n5(var7) > 1.0E-4) {
                  ShapeFrame var8 = this.p8();
                  this.n5(
                     new ShapeFrame(
                        var8.getX() + var6, var8.getY() + var7, var8.getWidth(), var8.getHeight(), var8.getFlipH(), var8.getFlipV(), var8.getRotation()
                     )
                  );
               }
            }

            this.k5();
         }
      }
   }

   private void y4() {
      this.t4 = this.u3 != null ? this.u3.t2() : 0L;
      this.q0 = this.u9 != null ? this.u9.t2() : 0L;
      this.z3 = (int)this.h0;
      this.m1 = (int)this.e2;
   }

   @Override
   com.aspose.slides.internal.o9b.w1[] P_() {
      return null;
   }

   @Override
   float[] Q_() {
      return null;
   }

   private Connector$l6 n5(boolean[] var1, boolean[] var2) {
      com.aspose.slides.internal.o9b.w1 var3 = n5(this.u3, this.h0).u3();
      com.aspose.slides.internal.o9b.w1 var4 = n5(this.u9, this.e2).u3();
      var1[0] = com.aspose.slides.internal.o9b.w1.l6(var3, com.aspose.slides.internal.o9b.w1.n5);
      var2[0] = com.aspose.slides.internal.o9b.w1.l6(var4, com.aspose.slides.internal.o9b.w1.n5);
      return new Connector$l6(var3.u3(), var4.u3());
   }

   private void n5(Connector$l6 var1) {
      int var2 = var1.n5() > var1.k5() ? 1 : 0;
      int var3 = var1.l6() > var1.u3() ? 1 : 0;
      this.n5(new ShapeFrame(var1.a6(), var1.u9(), var1.h0(), var1.c8(), (byte)var2, (byte)var3, 0.0F));
   }

   private void n5(Connector$l6 var1, float var2, float var3) {
      float var4 = var3 - var2;
      if (var4 < -180.0F) {
         var4 += 360.0F;
      }

      if (var4 > 180.0F) {
         var4 -= 360.0F;
      }

      com.aspose.slides.internal.x4g.m1 var5 = new com.aspose.slides.internal.x4g.m1();
      var5.n5(-var2, var1.t2().u3());
      Connector$l6 var6 = var1.n5(var5).z1();
      com.aspose.slides.internal.o9b.y1 var7 = n5(var5, this.u3).y4();
      com.aspose.slides.internal.o9b.y1 var8 = n5(var5, this.u9).y4();
      Connector$n5 var9 = new Connector$n5();
      if (com.aspose.slides.ms.System.q1.n5(var4) == 180.0F) {
         this.n5(var7.y4(), var8.y4(), var6.z1()).n5(var9);
      } else if (com.aspose.slides.ms.System.q1.n5(var4) == 0.0F) {
         this.l6(var7.y4(), var8.y4(), var6.z1()).n5(var9);
      } else if (var4 == 90.0F) {
         this.k5(var7.y4(), var8.y4(), var6.z1()).n5(var9);
      } else {
         this.u3(var7.y4(), var8.y4(), var6.z1()).n5(var9);
      }

      this.n5(new ShapeFrame(var6.a6(), var6.u9(), var6.n3(), var6.y4(), (byte)(var9.n5 ? 1 : 0), (byte)(var9.l6 ? 1 : 0), var2));
   }

   private Connector$n5 n5(com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.y1 var2, Connector$l6 var3) {
      Connector$n5 var4 = new Connector$n5();
      if (var1.h0() < var2.a6()) {
         if (var3.l6() > var3.u3()) {
            var4.l6 = true;
         } else {
            var4.l6 = false;
         }

         this.n5(1);
         this.getAdjustments().get_Item(0).setRawValue(50000L);
      } else {
         double var5 = var3.e2();
         double var7 = var3.t9();
         this.n5(3);
         if (var3.n5() > var3.k5()) {
            this.getAdjustments().get_Item(0).setRawValue(com.aspose.slides.internal.v6g.k5.u9(-var5 * 18.0, 14));
            this.getAdjustments().get_Item(2).setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 + var5 * 18.0, 14));
            var4.n5 = true;
         } else {
            long var9 = com.aspose.slides.internal.v6g.k5.u9((36.0F - var3.h0()) / 2.0F * var5, 14);
            this.getAdjustments().get_Item(0).setRawValue(50000L + var9);
            this.getAdjustments().get_Item(2).setRawValue(50000L - var9);
         }

         if (var1.t2() > var2.l6()) {
            this.getAdjustments()
               .get_Item(1)
               .setRawValue(com.aspose.slides.internal.v6g.k5.u9(var7 * (var3.l6() - var1.t2() + (var1.t2() - var2.l6()) / 2.0F), 14));
            var4.l6 = true;
         } else if (var2.t2() > var1.l6()) {
            this.getAdjustments()
               .get_Item(1)
               .setRawValue(com.aspose.slides.internal.v6g.k5.u9(var7 * (var1.l6() - var3.l6() + (var2.t2() - var1.l6()) / 2.0F), 14));
         } else if (var3.l6() > var3.u3()) {
            this.getAdjustments()
               .get_Item(1)
               .setRawValue(com.aspose.slides.internal.v6g.k5.u9(var7 * (var3.l6() - com.aspose.slides.ms.System.q1.l6(var1.t2(), var2.t2()) + 18.0F), 14));
            var4.l6 = true;
         } else {
            this.getAdjustments()
               .get_Item(1)
               .setRawValue(com.aspose.slides.internal.v6g.k5.u9(var7 * (com.aspose.slides.ms.System.q1.n5((float)(var1.l6()), (float)(var2.l6())) - var3.l6() + 18.0F), 14));
         }
      }

      return var4;
   }

   private Connector$n5 l6(com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.y1 var2, Connector$l6 var3) {
      Connector$n5 var4 = new Connector$n5();
      double var5 = var3.e2();
      double var7 = var3.t9();
      long var9 = com.aspose.slides.internal.v6g.k5.u9(
         (com.aspose.slides.ms.System.q1.n5((float)(var1.h0()), (float)(var2.h0())) - com.aspose.slides.ms.System.q1.n5((float)(var3.k5()), (float)(var3.n5())) + 18.0F) * var5, 14
      );
      if (var1.h0() < var2.a6()) {
         if (var3.l6() > var3.u3()) {
            var4.l6 = true;
            if (var3.l6() > var2.l6()) {
               this.n5(1);
               this.getAdjustments().get_Item(0).setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 + var5 * 18.0, 14));
            } else {
               this.n5(3);
               this.getAdjustments()
                  .get_Item(0)
                  .setRawValue(com.aspose.slides.internal.v6g.k5.u9((var3.h0() - var2.s7() - (var1.h0() - var3.n5())) / 2.0F * var5, 14));
               this.getAdjustments().get_Item(1).setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 + (var3.u3() - var2.t2() + 18.0F) * var7, 14));
               this.getAdjustments().get_Item(2).setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 + var5 * 18.0, 14));
            }
         } else {
            if (var3.c8() < 1.0F) {
               var4.l6 = true;
            }

            if (var3.l6() < var2.t2()) {
               this.n5(1);
               this.getAdjustments().get_Item(0).setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 + var5 * 18.0, 14));
            } else {
               this.n5(3);
               this.getAdjustments()
                  .get_Item(0)
                  .setRawValue(com.aspose.slides.internal.v6g.k5.u9((var3.h0() - var2.s7() - (var1.h0() - var3.n5())) / 2.0F * var5, 14));
               this.getAdjustments().get_Item(1).setRawValue(com.aspose.slides.internal.v6g.k5.u9((var2.t2() - var3.l6() - 18.0F) * var7, 14));
               this.getAdjustments().get_Item(2).setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 + var5 * 18.0, 14));
            }
         }
      } else if (var1.a6() <= var2.h0()) {
         this.n5(1);
         if (var3.n5() < var3.k5()) {
            this.getAdjustments().get_Item(0).setRawValue(100000L + var9);
         } else {
            this.getAdjustments().get_Item(0).setRawValue(-var9);
            var4.n5 = true;
         }

         if (var3.l6() > var3.u3()) {
            var4.l6 = true;
         }
      } else if (var3.u3() >= var1.t2() && var3.u3() <= var1.l6()) {
         this.n5(3);
         long var11 = com.aspose.slides.internal.v6g.k5.u9((var1.l6() - var3.l6() + 18.0F) * var7, 14);
         this.getAdjustments().get_Item(0).setRawValue(-var9);
         this.getAdjustments().get_Item(2).setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 - (var3.h0() - var1.s7()) / 2.0F * var5, 14));
         if (var3.l6() > var3.u3()) {
            this.getAdjustments().get_Item(1).setRawValue(-var11);
            var4.l6 = true;
         } else {
            this.getAdjustments().get_Item(1).setRawValue(var11);
            if (var3.c8() < 1.0F) {
               var4.l6 = true;
            }
         }

         var4.n5 = true;
      } else {
         this.n5(1);
         this.getAdjustments().get_Item(0).setRawValue(-var9);
         var4.n5 = true;
         if (var3.u3() < var1.t2()) {
            var4.l6 = true;
         }
      }

      return var4;
   }

   private Connector$n5 k5(com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.y1 var2, Connector$l6 var3) {
      Connector$n5 var4 = new Connector$n5();
      double var5 = var3.e2();
      double var7 = var3.t9();
      if (var1.h0() < var2.a6() || var1.h0() < var3.k5() && var3.l6() > var3.u3()) {
         if (var3.l6() > var3.u3()) {
            this.n5(0);
            var4.l6 = true;
         } else {
            this.n5(2);
            this.getAdjustments()
               .get_Item(0)
               .setRawValue(com.aspose.slides.internal.v6g.k5.u9((var3.h0() - (var3.k5() - var2.a6()) - (var1.h0() - var3.n5())) / 2.0F * var5, 14));
            this.getAdjustments().get_Item(1).setRawValue(com.aspose.slides.internal.v6g.k5.u9(100000.0 + var7 * 18.0, 14));
         }
      } else if (var2.l6() < var1.t2()) {
         long var9 = com.aspose.slides.internal.v6g.k5.u9((var1.t2() - var3.u3()) / 2.0F * var7, 14);
         long var11 = com.aspose.slides.internal.v6g.k5.u9(18.0 * var5, 14);
         this.n5(2);
         var4.l6 = true;
         if (var3.n5() > var3.k5()) {
            this.getAdjustments().get_Item(0).setRawValue(-var11);
            this.getAdjustments().get_Item(1).setRawValue(100000L - var9);
            var4.n5 = true;
         } else {
            this.getAdjustments().get_Item(0).setRawValue(var11);
            this.getAdjustments().get_Item(1).setRawValue(100000L - var9);
         }
      } else {
         this.n5(2);
         long var13 = com.aspose.slides.internal.v6g.k5.u9((com.aspose.slides.ms.System.q1.n5((float)(var1.l6()), (float)(var2.l6())) - var3.l6() + 18.0F) * var7, 14);
         long var14 = com.aspose.slides.internal.v6g.k5.u9(
            (com.aspose.slides.ms.System.q1.n5((float)(var1.h0()), (float)(var2.h0())) - com.aspose.slides.ms.System.q1.n5((float)(var3.k5()), (float)(var3.n5())) + 18.0F) * var5, 14
         );
         if (var3.n5() < var3.k5()) {
            this.getAdjustments().get_Item(0).setRawValue(100000L + var14);
         } else {
            this.getAdjustments().get_Item(0).setRawValue(-var14);
            var4.n5 = true;
         }

         if (var3.l6() > var3.u3()) {
            this.getAdjustments().get_Item(1).setRawValue(-var13);
            var4.l6 = true;
         } else {
            this.getAdjustments().get_Item(1).setRawValue(var13);
         }
      }

      return var4;
   }

   private Connector$n5 u3(com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.y1 var2, Connector$l6 var3) {
      Connector$n5 var4 = new Connector$n5();
      double var5 = var3.e2();
      double var7 = var3.t9();
      if (var1.h0() < var2.a6() || var1.h0() < var3.k5() && var3.l6() < var3.u3()) {
         if (var3.l6() < var3.u3()) {
            this.n5(0);
         } else {
            var4.l6 = true;
            this.n5(2);
            this.getAdjustments()
               .get_Item(0)
               .setRawValue(com.aspose.slides.internal.v6g.k5.u9((var3.h0() - (var3.k5() - var2.a6()) - (var1.h0() - var3.n5())) / 2.0F * var5, 14));
            this.getAdjustments()
               .get_Item(1)
               .setRawValue(
                  com.aspose.slides.internal.v6g.k5.u9(
                     100000.0 + (var3.l6() - com.aspose.slides.ms.System.q1.l6(var1.t2(), var3.u3()) - var3.c8() + 18.0F) * var7, 14
                  )
               );
         }
      } else if (var2.t2() > var1.l6()) {
         long var9 = com.aspose.slides.internal.v6g.k5.u9((var2.t2() - var1.l6()) / 2.0F * var7, 14);
         long var11 = com.aspose.slides.internal.v6g.k5.u9(18.0 * var5, 14);
         this.n5(2);
         if (var3.n5() > var3.k5()) {
            this.getAdjustments().get_Item(0).setRawValue(-var11);
            this.getAdjustments().get_Item(1).setRawValue(100000L - var9);
            var4.n5 = true;
         } else {
            this.getAdjustments().get_Item(0).setRawValue(var11);
            this.getAdjustments().get_Item(1).setRawValue(100000L - var9);
         }
      } else {
         this.n5(2);
         long var13 = com.aspose.slides.internal.v6g.k5.u9(
            100000.0 + (var3.l6() - com.aspose.slides.ms.System.q1.l6(var1.t2(), var3.u3()) - var3.c8() + 18.0F) * var7, 14
         );
         long var14 = com.aspose.slides.internal.v6g.k5.u9(
            (com.aspose.slides.ms.System.q1.n5((float)(var1.h0()), (float)(var2.h0())) - com.aspose.slides.ms.System.q1.n5((float)(var3.k5()), (float)(var3.n5())) + 18.0F) * var5, 14
         );
         if (var3.n5() < var3.k5()) {
            this.getAdjustments().get_Item(0).setRawValue(100000L + var14);
         } else {
            this.getAdjustments().get_Item(0).setRawValue(-var14);
            var4.n5 = true;
         }

         if (var3.l6() > var3.u3()) {
            this.getAdjustments().get_Item(1).setRawValue(var13);
            var4.l6 = true;
         } else {
            this.getAdjustments().get_Item(1).setRawValue(-var13);
         }
      }

      return var4;
   }

   private boolean m3() {
      return this.getShapeType() == 1 || this.getShapeType() == 96;
   }

   private boolean z8() {
      return this.getShapeType() >= 97 && this.getShapeType() <= 100;
   }

   private boolean j5() {
      return this.getShapeType() >= 101 && this.getShapeType() <= 104;
   }

   private void n5(int var1) {
      if (this.j5()) {
         this.setShapeType(101 + var1);
      } else if (this.z8()) {
         this.setShapeType(97 + var1);
      }
   }

   private void u3(Shape var1) {
      this.u3 = null;
      this.h0 = 0L;
      com.aspose.slides.internal.o9b.w1.n5.n5(this.t9);
      this.t4 = 0L;
   }

   private void a6(Shape var1) {
      this.u9 = null;
      this.e2 = 0L;
      com.aspose.slides.internal.o9b.w1.n5.n5(this.z1);
      this.q0 = 0L;
   }

   private static com.aspose.slides.internal.o9b.w1 n5(Shape var0, long var1) {
      com.aspose.slides.internal.o9b.w1 var3 = com.aspose.slides.internal.o9b.w1.n5.u3();
      if (var0 != null) {
         com.aspose.slides.internal.o9b.w1[] var4 = var0.e5().c8();
         if (var4 != null && var4.length > (var1 & 4294967295L)) {
            var4[(int)var1].n5(var3);
         }
      }

      return var3;
   }

   private static com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.x4g.m1 var0, Shape var1) {
      com.aspose.slides.internal.o9b.y1 var2 = var1.p8().n5().y4();
      float var3 = var2.a6();
      float var4 = var2.t2();
      float var5 = var2.h0();
      float var6 = var2.l6();
      com.aspose.slides.internal.o9b.w1[] var7 = new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(var3, var4),
         new com.aspose.slides.internal.o9b.w1(var5, var4),
         new com.aspose.slides.internal.o9b.w1(var3, var6),
         new com.aspose.slides.internal.o9b.w1(var5, var6)
      };
      var0.n5(var7);
      var3 = var5 = var7[0].l6();
      var4 = var6 = var7[0].k5();

      for (int var8 = 1; var8 < var7.length; var8++) {
         com.aspose.slides.internal.o9b.w1 var9 = var7[var8].u3();
         if (var3 > var9.l6()) {
            var3 = var9.l6();
         }

         if (var5 < var9.l6()) {
            var5 = var9.l6();
         }

         if (var4 > var9.k5()) {
            var4 = var9.k5();
         }

         if (var6 < var9.k5()) {
            var6 = var9.k5();
         }
      }

      return new com.aspose.slides.internal.o9b.y1(
         (float)com.aspose.slides.ms.System.q1.n5((double)(var3), 3),
         (float)com.aspose.slides.ms.System.q1.n5((double)(var4), 3),
         (float)com.aspose.slides.ms.System.q1.n5((double)(var5 - var3), 3),
         (float)com.aspose.slides.ms.System.q1.n5((double)(var6 - var4), 3)
      );
   }

   private static double n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      double var2 = var1.l6() - var0.l6();
      double var4 = var1.k5() - var0.k5();
      return com.aspose.slides.ms.System.q1.z3(var2 * var2 + var4 * var4);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   d9l u9() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   d9l h0() {
      return this.n5();
   }


   // $VF: synthetic method
   static void n5(Connector var0, Shape var1) {
      var0.u3(var1);
   }

   // $VF: synthetic method
   static void l6(Connector var0, Shape var1) {
      var0.a6(var1);
   }
}
