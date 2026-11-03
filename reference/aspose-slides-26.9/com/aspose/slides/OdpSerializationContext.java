package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class OdpSerializationContext extends com.aspose.slides.internal.c8m.n3 {
   private IGenericDictionary<IAudio, String> n5;
   private IGenericDictionary<IVideo, String> l6;
   private boolean k5;
   private com.aspose.slides.internal.k4y.t1g u3;
   private final Presentation a6;
   private int u9;
   private final IGenericDictionary<Long, OdpSerializationContext$ImageData> h0 = new Dictionary<>();
   private final IGenericDictionary<Integer, IPPImage> c8 = new SortedDictionary<>();
   private final IGenericDictionary<byte[], Integer> t2 = new Dictionary<>();
   private final InterruptionToken s7;
   private BaseSlide x8;

   public OdpSerializationContext(IPresentation presentation, InterruptionToken interruptionToken) {
      this.a6 = (Presentation)presentation;
      this.s7 = interruptionToken;
      this.n5(new Dictionary<>());
      this.l6(new Dictionary<>());
   }

   final Presentation n5() {
      return this.a6;
   }

   public final com.aspose.slides.internal.k4y.t1g l6() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.k4y.t1g var1) {
      this.u3 = var1;
   }

   public final IGenericEnumerable<OdpSerializationContext$ImageData> k5() {
      return this.h0.getValues();
   }

   public final IGenericDictionary<Integer, IPPImage> u3() {
      return this.c8;
   }

   public final IGenericDictionary<byte[], Integer> a6() {
      return this.t2;
   }

   public final IGenericDictionary<IAudio, String> u9() {
      return this.n5;
   }

   private void n5(IGenericDictionary<IAudio, String> var1) {
      this.n5 = var1;
   }

   public final IGenericDictionary<IVideo, String> h0() {
      return this.l6;
   }

   private void l6(IGenericDictionary<IVideo, String> var1) {
      this.l6 = var1;
   }

   public final BaseSlide c8() {
      return this.x8;
   }

   public final void n5(BaseSlide var1) {
      this.x8 = var1;
   }

   public final InterruptionToken t2() {
      return this.s7;
   }

   public final String n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("oleObjectData");
      }

      int var2 = this.l6(var1);
      return com.aspose.slides.ms.System.d1.n5(new String[]{"./", l6(var2)});
   }

   public final String n5(IPPImage var1) {
      if (var1 == null) {
         throw new ArgumentNullException("image");
      }

      int var2 = 0;
      IGenericEnumerator var3 = this.c8.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            if (((IPPImage)var4.getValue()).equals(var1)) {
               var2 = (Integer)var4.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (var2 < this.x8() && !this.c8.containsKey(this.x8())) {
         var2 = this.x8();
         this.c8.addItem(var2, var1);
      }

      return n5(var2);
   }

   public final String n5(IAudio var1) {
      if (var1 == null) {
         throw new ArgumentNullException("audio");
      }

      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = !this.u9().tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         Audio var5 = (Audio)var1;
         String var6 = var5.n5().n5();
         if (!com.aspose.slides.ms.System.d1.n5(var6) && !com.aspose.slides.ms.System.d1.l6(var6, "media")) {
            int var7 = com.aspose.slides.ms.System.d1.k5(var6, '.');
            if (var7 > 0) {
               var6 = com.aspose.slides.ms.System.d1.n5(new String[]{
                  com.aspose.slides.ms.System.d1.l6(var6, 0, var7), com.aspose.slides.ms.System.a3.l6(this.u9().size() + 1)
               });
            }
         } else {
            var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"media", com.aspose.slides.ms.System.a3.l6(this.u9().size() + 1)});
         }

         var2 = com.aspose.slides.ms.System.d1.n5("Media/{0}.{1}",new Object[]{ var6, var5.u9()});
         this.u9().addItem(var1, var2);
      }

      return var2;
   }

   public final String n5(IVideo var1) {
      if (var1 == null) {
         throw new ArgumentNullException("video");
      }

      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = !this.h0().tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         var2 = com.aspose.slides.ms.System.d1.n5("Media/{0}{1}.{2}",new Object[]{ "media", this.h0().size() + 1, ((Video)var1).u3()});
         this.h0().addItem(var1, var2);
      }

      return var2;
   }

   public final String n5(long var1, String var3, byte[] var4, com.aspose.slides.internal.f3.k5<byte[]> var5) {
      if (var4 == null && var5 == null) {
         throw new ArgumentNullException("bytes");
      }

      OdpSerializationContext$ImageData var6 = new OdpSerializationContext$ImageData();
      OdpSerializationContext$ImageData[] var7 = new OdpSerializationContext$ImageData[]{var6};
      boolean var8 = !this.h0.tryGetValue(var1, var7);
      var7[0].CloneTo(var6);
      if (var8) {
         var6 = new OdpSerializationContext$ImageData();
         var6.Index = this.h0.size() + 1;
         var6.ContentType = var3;
         var6.BinaryData = var4;
         var6.GetBinaryData = var5;
         this.h0.addItem(var1, var6.Clone());
      }

      return n5(var6.Index, var6.ContentType);
   }

   public final String n5(PPImage var1) {
      if (var1 == null) {
         throw new ArgumentNullException("image");
      } else {
         return this.n5(var1.u9(), var1.getContentType(), null, new OdpSerializationContext$1(this, var1));
      }
   }

   public final void n5(i4v var1, PPImage var2) {
      String var3 = this.n5(var2);
      this.n5(var1, var3);
   }

   public final void n5(i4v var1, String var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5("Img{0}", new Object[]{this.l6().u3().n5().size()});
      var1.n5(var3);
      com.aspose.slides.internal.k4y.r9i var4 = (com.aspose.slides.internal.k4y.r9i)this.l6().u3().n5("fill-image").l6();
      var4.n5(var3);
      var4.l6(var2);
   }

   public static String n5(int var0, String var1) {
      return com.aspose.slides.ms.System.d1.n5("Pictures/image{0}.{1}",new Object[]{ var0, ImageCollection.u3(var1)});
   }

   public static String n5(int var0) {
      return com.aspose.slides.ms.System.d1.n5("ObjectReplacements/Object {0}", new Object[]{var0});
   }

   public static String l6(int var0) {
      return com.aspose.slides.ms.System.d1.n5("Object {0}", new Object[]{var0});
   }

   public final int s7() {
      return ++this.u9;
   }

   public final int x8() {
      return this.u9;
   }

   public final boolean n3() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   private int l6(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("oleObjectData");
      }

      if (this.t2.containsKey(var1)) {
         return this.t2.get_Item(var1);
      }

      int var2 = this.s7();
      this.t2.addItem(var1, var2);
      return var2;
   }
}
