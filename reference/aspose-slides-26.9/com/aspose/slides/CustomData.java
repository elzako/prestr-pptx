package com.aspose.slides;

public class CustomData implements ICustomData, r0g {
   private final r0g n5;
   private final TagCollection l6;
   private CustomXmlPartCollection k5;
   private final x8w u3;

   @Override
   public final ITagCollection getTags() {
      return this.l6;
   }

   @Override
   public final ICustomXmlPartCollection getCustomXmlParts() {
      if (this.k5 == null) {
         this.k5 = new CustomXmlPartCollection(this);
      }

      return this.k5;
   }

   CustomData(r0g parentImmediate) {
      this.n5 = parentImmediate;
      this.l6 = new TagCollection();
      this.u3 = new x8w();
   }

   final x8w n5() {
      return this.u3;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   void l6() {
      this.l6.clear();
      if (this.k5 != null) {
         this.k5.clear();
      }
   }
}
