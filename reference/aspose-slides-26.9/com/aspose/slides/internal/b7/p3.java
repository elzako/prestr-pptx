package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;

public final class p3 implements IGenericCloneable<p3> {
   private double n5;
   private double l6;
   private m2 k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "isometricBottomDown",
      "isometricBottomUp",
      "isometricLeftDown",
      "isometricLeftUp",
      "isometricOffAxis1Left",
      "isometricOffAxis1Right",
      "isometricOffAxis1Top",
      "isometricOffAxis2Left",
      "isometricOffAxis2Right",
      "isometricOffAxis2Top",
      "isometricOffAxis3Bottom",
      "isometricOffAxis3Left",
      "isometricOffAxis3Right",
      "isometricOffAxis4Bottom",
      "isometricOffAxis4Left",
      "isometricOffAxis4Right",
      "isometricRightDown",
      "isometricRightUp",
      "isometricTopDown",
      "isometricTopUp",
      "legacyObliqueBottom",
      "legacyObliqueBottomLeft",
      "legacyObliqueBottomRight",
      "legacyObliqueFront",
      "legacyObliqueLeft",
      "legacyObliqueRight",
      "legacyObliqueTop",
      "legacyObliqueTopLeft",
      "legacyObliqueTopRight",
      "legacyPerspectiveBottom",
      "legacyPerspectiveBottomLeft",
      "legacyPerspectiveBottomRight",
      "legacyPerspectiveFront",
      "legacyPerspectiveLeft",
      "legacyPerspectiveRight",
      "legacyPerspectiveTop",
      "legacyPerspectiveTopLeft",
      "legacyPerspectiveTopRight",
      "obliqueBottom",
      "obliqueBottomLeft",
      "obliqueBottomRight",
      "obliqueLeft",
      "obliqueRight",
      "obliqueTop",
      "obliqueTopLeft",
      "obliqueTopRight",
      "orthographicFront",
      "perspectiveAbove",
      "perspectiveAboveLeftFacing",
      "perspectiveAboveRightFacing",
      "perspectiveBelow",
      "perspectiveContrastingLeftFacing",
      "perspectiveContrastingRightFacing",
      "perspectiveFront",
      "perspectiveHeroicExtremeLeftFacing",
      "perspectiveHeroicExtremeRightFacing",
      "perspectiveHeroicLeftFacing",
      "perspectiveHeroicRightFacing",
      "perspectiveLeft",
      "perspectiveRelaxed",
      "perspectiveRelaxedModerately",
      "perspectiveRight"
   );

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final void l6(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final void n5(m2 var1) {
      if (this.k5 != var1) {
         if (var1 == null) {
            throw new ArgumentNullException("value");
         }

         this.k5 = var1.n5();
      }
   }

   public p3() {
      this.n5(-1);
   }

   public p3(int var1) {
      this.n5(var1);
   }

   private void n5(int var1) {
      this.u3 = var1;
      this.n5 = 0.0;
      this.l6 = 100.0;
      switch (this.u3) {
         case -1:
         case 46:
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 0:
            this.k5 = new m2(1.8882E7, 2124000.0, 1.7988E7);
            break;
         case 1:
            this.k5 = new m2(2718000.0, 2124000.0, 3612000.0);
            break;
         case 2:
            this.k5 = new m2(2700000.0, 2100000.0, 0.0);
            break;
         case 3:
            this.k5 = new m2(2700000.0, 2100000.0, 0.0);
            break;
         case 4:
            this.k5 = new m2(3840000.0, 1080000.0, 0.0);
            break;
         case 5:
            this.k5 = new m2(2.004E7, 1080000.0, 0.0);
            break;
         case 6:
            this.k5 = new m2(1.839E7, 1.8078E7, 3456000.0);
            break;
         case 7:
            this.k5 = new m2(1560000.0, 1080000.0, 0.0);
            break;
         case 8:
            this.k5 = new m2(1.776E7, 1080000.0, 0.0);
            break;
         case 9:
            this.k5 = new m2(3210000.0, 1.8078E7, 1.8144E7);
            break;
         case 10:
            this.k5 = new m2(1.839E7, 3522000.0, 1.8144E7);
            break;
         case 11:
            this.k5 = new m2(3840000.0, 2.052E7, 0.0);
            break;
         case 12:
            this.k5 = new m2(2.004E7, 2.052E7, 0.0);
            break;
         case 13:
            this.k5 = new m2(3210000.0, 3522000.0, 3456000.0);
            break;
         case 14:
            this.k5 = new m2(1560000.0, 2.052E7, 0.0);
            break;
         case 15:
            this.k5 = new m2(1.89E7, 1.95E7, 0.0);
            break;
         case 16:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         default:
            throw new NotImplementedException();
         case 17:
            this.k5 = new m2(1.89E7, 2100000.0, 0.0);
            break;
         case 18:
            this.k5 = new m2(2718000.0, 1.9476E7, 1.7988E7);
            break;
         case 19:
            this.k5 = new m2(1.8882E7, 1.9476E7, 3612000.0);
            break;
         case 29:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 30:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 31:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 32:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 33:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 34:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 35:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 36:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 37:
            this.n5 = 65.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 47:
            this.n5 = 45.0;
            this.k5 = new m2(0.0, 2.04E7, 0.0);
            break;
         case 48:
            this.n5 = 45.0;
            this.k5 = new m2(858000.0, 2358000.0, 2.0466E7);
            break;
         case 49:
            this.n5 = 45.0;
            this.k5 = new m2(2.0742E7, 2358000.0, 1134000.0);
            break;
         case 50:
            this.n5 = 45.0;
            this.k5 = new m2(0.0, 1200000.0, 0.0);
            break;
         case 51:
            this.n5 = 45.0;
            this.k5 = new m2(2634000.0, 624000.0, 2.1384E7);
            break;
         case 52:
            this.n5 = 45.0;
            this.k5 = new m2(1.8966E7, 624000.0, 216000.0);
            break;
         case 53:
            this.n5 = 45.0;
            this.k5 = new m2(0.0, 0.0, 0.0);
            break;
         case 54:
            this.n5 = 45.0;
            this.k5 = new m2(2070000.0, 486000.0, 2.1426E7);
            break;
         case 55:
            this.n5 = 45.0;
            this.k5 = new m2(1.953E7, 486000.0, 174000.0);
            break;
         case 56:
            this.n5 = 45.0;
            this.k5 = new m2(858000.0, 2.094E7, 156000.0);
            break;
         case 57:
            this.n5 = 45.0;
            this.k5 = new m2(2.0742E7, 2.094E7, 2.1444E7);
            break;
         case 58:
            this.n5 = 45.0;
            this.k5 = new m2(1200000.0, 0.0, 0.0);
            break;
         case 59:
            this.n5 = 45.0;
            this.k5 = new m2(0.0, 1.8576E7, 0.0);
            break;
         case 60:
            this.n5 = 45.0;
            this.k5 = new m2(0.0, 1.9488E7, 0.0);
            break;
         case 61:
            this.n5 = 45.0;
            this.k5 = new m2(2.04E7, 0.0, 0.0);
      }
   }

   public final p3 n5() {
      p3 var1 = new p3(this.u3);
      var1.n5(this.n5);
      var1.n5(this.k5.n5());
      var1.l6(this.l6);
      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public p3 cloneT() {
      return this.n5();
   }

}
