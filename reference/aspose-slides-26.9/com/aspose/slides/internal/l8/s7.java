package com.aspose.slides.internal.l8;

import com.aspose.slides.ms.System.q1;

public class s7 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.x8 var3 = new com.aspose.slides.internal.q6.x8(var1[0]);
      long var4 = var2.x8().getPosition();
      if ((var3.l6() & 65535) < 34) {
         com.aspose.slides.internal.f8y.n5.n5(
            "Warning: Invalid ByteCount=0x{0:X8} for WmfEmfEscape.  This value MUST be 34 plus the value of the EnhancedMetafileDataSize field.", var3.l6()
         );
         return this.n5(var1, var2, var4);
      } else {
         var3.n5(var2.c4());
         if ((var3.k5() & 4294967295L) != 1128680791L) {
            com.aspose.slides.internal.f8y.n5.n5("Warning: Invalid CommentIdentifier=0x{0:X8} for WmfEmfEscape.  This value MUST be 0x43464D57.", var3.k5());
            return this.n5(var1, var2, var4);
         } else {
            var3.u3(var2.c4());
            if ((var3.u3() & 4294967295L) != 1L) {
               com.aspose.slides.internal.f8y.n5.n5("Warning: Invalid CommentType=0x{0:X8} for WmfEmfEscape. This value MUST be 0x00000001.", var3.u3());
               return this.n5(var1, var2, var4);
            } else {
               var3.a6(var2.c4());
               if ((var3.u9() & 4294967295L) != 65536L) {
                  com.aspose.slides.internal.f8y.n5.n5("Warning: Invalid Version=0x{0:X8} for WmfEmfEscape. This value MUST be 0x00010000.", var3.u9());
                  return this.n5(var1, var2, var4);
               } else {
                  var3.u3(var2.r4());
                  var3.u9(var2.c4());
                  var3.h0(var2.c4());
                  var3.c8(var2.c4());
                  if ((var3.s7() & 4294967295L) > 8192L) {
                     com.aspose.slides.internal.f8y.n5.n5(
                        "Warning: Invalid CurrentRecordSize={0} for WmfEmfEscape.  This value MUST be less than or equal to 8192", var3.s7()
                     );
                     return this.n5(var1, var2, var4);
                  } else {
                     var3.t2(var2.c4());
                     var3.s7(var2.c4());
                     if ((var3.s7() & 4294967295L) > (var3.l6() & 65535) - 34) {
                        com.aspose.slides.internal.f8y.n5.n5(
                           "Warning: Invalid EnhancedMetafileDataSize=0x{0:X8} for WmfEmfEscape.  This value MUST be ByteCount - 34.", var3.s7()
                        );
                        return this.n5(var1, var2, var4);
                     } else {
                        var3.n5(var2.c8((int)var3.s7()));
                        var1[0] = var3;
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2, long var3) {
      com.aspose.slides.internal.q6.x8 var5 = new com.aspose.slides.internal.q6.x8(var1[0]);
      var2.x8().seek(var3, 0);
      long var6 = (var5.e2() & 4294967295L) * 2L & 4294967295L;
      byte var8 = 10;
      var5.n5(true);
      var5.l6(var2.c8(q1.l6((int)((var6 & 4294967295L) - var8 & 4294967295L), var5.l6() & 65535)));
      var1[0] = var5;
      return true;
   }
}
