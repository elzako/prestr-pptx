package com.aspose.slides.internal.x1j;

import java.awt.geom.PathIterator;

class c8$l6 implements PathIterator {
   private final PathIterator n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private final float u9;
   private final float h0;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   c8$l6(PathIterator var1, c8$n5 var2) {
      this.n5 = var1;
      switch (var2) {
         case ON_NO_AA:
            this.u9 = this.h0 = 0.25F;
            break;
         case ON_WITH_AA:
            this.u9 = 0.0F;
            this.h0 = 0.5F;
            break;
         case OFF:
            throw new InternalError("A NormalizingPathIterator should not be created if no normalization is being done");
         default:
            throw new InternalError("Unrecognized normalization mode");
      }
   }

   @Override
   public int currentSegment(float[] coords) {
      int var2 = this.n5.currentSegment(coords);
      byte var3;
      switch (var2) {
         case 0:
         case 1:
            var3 = 0;
            break;
         case 2:
            var3 = 2;
            break;
         case 3:
            var3 = 4;
            break;
         case 4:
            this.l6 = this.u3;
            this.k5 = this.a6;
            return var2;
         default:
            throw new InternalError("Unrecognized curve type");
      }

      float var4 = (float)Math.floor(coords[var3] + this.u9) + this.h0 - coords[var3];
      float var5 = (float)Math.floor(coords[var3 + 1] + this.u9) + this.h0 - coords[var3 + 1];
      coords[var3] += var4;
      coords[var3 + 1] = coords[var3 + 1] + var5;
      switch (var2) {
         case 0:
            this.u3 = var4;
            this.a6 = var5;
         case 1:
         default:
            break;
         case 2:
            coords[0] += (this.l6 + var4) / 2.0F;
            coords[1] += (this.k5 + var5) / 2.0F;
            break;
         case 3:
            coords[0] += this.l6;
            coords[1] += this.k5;
            coords[2] += var4;
            coords[3] += var5;
            break;
         case 4:
            throw new InternalError("This should be handled earlier.");
      }

      this.l6 = var4;
      this.k5 = var5;
      return var2;
   }

   @Override
   public int currentSegment(double[] coords) {
      float[] var2 = new float[6];
      int var3 = this.currentSegment(var2);

      for (int var4 = 0; var4 < 6; var4++) {
         coords[var4] = var2[var4];
      }

      return var3;
   }

   @Override
   public int getWindingRule() {
      return this.n5.getWindingRule();
   }

   @Override
   public boolean isDone() {
      return this.n5.isDone();
   }

   @Override
   public void next() {
      this.n5.next();
   }
}
