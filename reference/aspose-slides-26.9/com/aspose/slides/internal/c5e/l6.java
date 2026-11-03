package com.aspose.slides.internal.c5e;

public class l6 {
   public final int n5;
   public final int l6;
   public final int k5;
   public final int u3;
   public final boolean a6;
   public final boolean u9;
   public final boolean h0;
   public final boolean c8;
   public final int t2;
   public final int s7;
   public final int x8;
   public final int n3;
   public final int y4;

   public l6(int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      this.n5 = var1;
      this.l6 = var2;
      this.a6 = var4;
      this.h0 = var6;
      this.u9 = var5;
      if (this.u9 && var6) {
         throw new e2("palette and greyscale are mutually exclusive");
      }

      this.u3 = !var5 && !var6 ? (var4 ? 4 : 3) : (var4 ? 2 : 1);
      this.k5 = var3;
      this.c8 = var3 < 8;
      this.t2 = this.u3 * this.k5;
      this.s7 = (this.t2 + 7) / 8;
      this.x8 = (this.t2 * var1 + 7) / 8;
      this.n3 = this.u3 * this.n5;
      this.y4 = this.c8 ? this.x8 : this.n3;
      switch (this.k5) {
         case 1:
         case 2:
         case 4:
            if (!this.h0 && !this.u9) {
               throw new e2("only indexed or grayscale can have bitdepth=" + this.k5);
            }
         case 8:
            break;
         case 16:
            if (this.h0) {
               throw new e2("indexed can't have bitdepth=" + this.k5);
            }
            break;
         default:
            throw new e2("invalid bitdepth=" + this.k5);
      }

      if (var1 < 1 || var1 > 1000000) {
         throw new e2("invalid cols=" + var1 + " ???");
      } else if (var2 < 1 || var2 > 1000000) {
         throw new e2("invalid rows=" + var2 + " ???");
      }
   }

   @Override
   public String toString() {
      return "ImageInfo [cols="
         + this.n5
         + ", rows="
         + this.l6
         + ", bitDepth="
         + this.k5
         + ", channels="
         + this.u3
         + ", bitspPixel="
         + this.t2
         + ", bytesPixel="
         + this.s7
         + ", bytesPerRow="
         + this.x8
         + ", samplesPerRow="
         + this.n3
         + ", samplesPerRowP="
         + this.y4
         + ", alpha="
         + this.a6
         + ", greyscale="
         + this.u9
         + ", indexed="
         + this.h0
         + ", packed="
         + this.c8
         + "]";
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = 31 * var2 + (this.a6 ? 1231 : 1237);
      var2 = 31 * var2 + this.k5;
      var2 = 31 * var2 + this.u3;
      var2 = 31 * var2 + this.n5;
      var2 = 31 * var2 + (this.u9 ? 1231 : 1237);
      var2 = 31 * var2 + (this.h0 ? 1231 : 1237);
      return 31 * var2 + this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      } else if (obj == null) {
         return false;
      } else if (this.getClass() != obj.getClass()) {
         return false;
      } else {
         l6 var2 = (l6)obj;
         if (this.a6 != var2.a6) {
            return false;
         } else if (this.k5 != var2.k5) {
            return false;
         } else if (this.u3 != var2.u3) {
            return false;
         } else if (this.n5 != var2.n5) {
            return false;
         } else if (this.u9 != var2.u9) {
            return false;
         } else {
            return this.h0 != var2.h0 ? false : this.l6 == var2.l6;
         }
      }
   }
}
