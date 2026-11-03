package com.aspose.slides.internal.l3;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.t4;

public class a6 extends n5 {
   public a6(t4 var1) {
      super(var1);
   }

   @Override
   public void write(byte[] srcBuffer, int srcOffset, int srcCount) {
      byte[] var4 = new byte[128];
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      byte var8 = 0;

      for (int var9 = 0; var9 < srcCount; var9++) {
         int var10 = srcOffset + var9;
         if (var8 != 0) {
            var6 = srcBuffer[var10] & 255;
            var7 = srcBuffer[var10 - 1] & 255;
         }

         switch (var8) {
            case 0:
               var8 = 1;
               var5 = 0;
               break;
            case 1:
               if (var6 == var7) {
                  var8 = 3;
                  var5 = 2;
               } else {
                  var8 = 2;
                  var4[0] = (byte)var7;
                  var5 = 1;
               }
               break;
            case 2:
               if (var6 == var7) {
                  this.n5(var4, var5);
                  var8 = 3;
                  var5 = 2;
               } else {
                  var4[var5] = (byte)var7;
                  if (++var5 == 128) {
                     this.n5(var4, var5);
                     var8 = 1;
                     var5 = 0;
                  }
               }
               break;
            case 3:
               if (var6 != var7) {
                  this.n5(var7, var5);
                  var8 = 1;
                  var5 = 0;
               } else if (++var5 == 128) {
                  this.n5(var6, var5);
                  var8 = 0;
               }
               break;
            default:
               throw new InvalidOperationException("Unknown RLE state.");
         }
      }

      switch (var8) {
         case 1:
         case 2:
            var4[var5] = (byte)var6;
            this.n5(var4, ++var5);
            break;
         case 3:
            this.n5(var6, var5);
            break;
         default:
            throw new InvalidOperationException("Unknown RLE state.");
      }

      super.n5.writeByte((byte)-127);
   }

   private void n5(byte[] var1, int var2) {
      super.n5.writeByte((byte)(var2 - 1));
      super.n5.write(var1, 0, var2);
   }

   private void n5(int var1, int var2) {
      super.n5.writeByte((byte)(257 - var2));
      super.n5.writeByte((byte)var1);
   }
}
