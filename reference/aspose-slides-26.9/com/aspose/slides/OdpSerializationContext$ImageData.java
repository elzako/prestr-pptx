package com.aspose.slides;

import java.util.Arrays;

public class OdpSerializationContext$ImageData extends com.aspose.slides.internal.v6g.h0<OdpSerializationContext$ImageData> {
   public int Index;
   public String ContentType;
   public byte[] BinaryData;
   public com.aspose.slides.internal.f3.k5<byte[]> GetBinaryData;

   public void CloneTo(OdpSerializationContext$ImageData that) {
      that.Index = this.Index;
      that.ContentType = this.ContentType;
      that.BinaryData = this.BinaryData;
      that.GetBinaryData = this.GetBinaryData;
   }

   public OdpSerializationContext$ImageData Clone() {
      OdpSerializationContext$ImageData var1 = new OdpSerializationContext$ImageData();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(OdpSerializationContext$ImageData var1) {
      return var1.Index == this.Index
         && com.aspose.slides.ms.System.j8.n5(var1.ContentType, this.ContentType)
         && com.aspose.slides.ms.System.j8.n5(var1.BinaryData, this.BinaryData)
         && com.aspose.slides.ms.System.j8.n5(var1.GetBinaryData, this.GetBinaryData);
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.internal.n2d.q0.n5(this.Index, this.ContentType);
      return 31 * var1 + Arrays.hashCode(this.BinaryData);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof OdpSerializationContext$ImageData) ? false : this.n5((OdpSerializationContext$ImageData)obj);
      }
   }

   public static boolean equals(OdpSerializationContext$ImageData obj1, OdpSerializationContext$ImageData obj2) {
      return obj1.equals(obj2);
   }
}
