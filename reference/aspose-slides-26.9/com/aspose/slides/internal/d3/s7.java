package com.aspose.slides.internal.d3;

public class s7 extends t9 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.q6.x8 var3 = (com.aspose.slides.internal.q6.x8)var1;
      if (var3.z3() && var3.m1() != null) {
         var2.n5(var3.m1());
         return true;
      } else if ((var3.l6() & 65535) < 34) {
         com.aspose.slides.internal.f8y.n5.n5(
            "Warning: Invalid ByteCount=0x{0:X8} for WmfEmfEscape.  This value MUST be 34 plus the value of the EnhancedMetafileDataSize field.", var3.l6()
         );
         return false;
      } else {
         var2.n5(1128680791L);
         var2.n5(1L);
         var2.n5(65536L);
         var2.n5(var3.h0() & 65535);
         var2.n5(var3.c8() & 4294967295L);
         var2.n5(var3.t2() & 4294967295L);
         var2.n5(var3.s7() & 4294967295L);
         if ((var3.s7() & 4294967295L) > 8192L) {
            com.aspose.slides.internal.f8y.n5.n5(
               "Warning: Invalid CurrentRecordSize={0} for WmfEmfEscape.  This value MUST be less than or equal to 8192", var3.s7()
            );
            return false;
         } else {
            var2.n5(var3.x8() & 4294967295L);
            var2.n5(var3.n3() & 4294967295L);
            var2.n5(var3.y4());
            return true;
         }
      }
   }
}
