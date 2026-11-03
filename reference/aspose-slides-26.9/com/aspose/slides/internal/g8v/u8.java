package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

@com.aspose.slides.ms.System.j3
public abstract class u8 implements com.aspose.slides.internal.h3d.s7, IDisposable {
   protected u8() {
   }

   public y5 n5() {
      throw new NotSupportedException();
   }

   static Exception c8() {
      return new NotImplementedException();
   }

   public com.aspose.slides.ms.System.r8 l6() {
      throw new NotSupportedException();
   }

   public void h0() {
      throw new NotSupportedException();
   }

   public com.aspose.slides.internal.z0k.t4 u9() {
      throw new NotSupportedException();
   }

   @Override
   public void dispose() {
      this.h0();
   }

   @Override
   public void getObjectData(com.aspose.slides.internal.h3d.c4 serializationInfo, com.aspose.slides.internal.h3d.s3 streamingContext) {
      throw c8();
   }
}
