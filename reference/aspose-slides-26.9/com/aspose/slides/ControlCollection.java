package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class ControlCollection implements IControlCollection, r0g {
   private final List<IControl> l6 = new List<>();
   BaseSlide n5;

   ControlCollection(BaseSlide parentImmediate) {
      this.n5 = parentImmediate;
   }

   @Override
   public final int size() {
      return this.l6.size();
   }

   @Override
   public final IControl addControl(int controlType, float x, float y, float width, float height) {
      Control var6 = null;
      switch (controlType) {
         case 0:
            var6 = this.l6();
            if (var6 != null) {
               var6.setFrame(new ShapeFrame(x, y, width, height, (byte)0, (byte)0, 0.0F));
               this.l6.addItem(var6);
            }

            return var6;
         default:
            throw new PptxException("Support of this control type is not implemented for PPTX yet.");
      }
   }

   final IControl n5() {
      Control var1 = new Control(this);
      this.l6.addItem(var1);
      return var1;
   }

   @Override
   public final void remove(IControl item) {
      this.l6.removeItem(item);
   }

   @Override
   public final void removeAt(int index) {
      this.l6.removeAt(index);
   }

   @Override
   public final void clear() {
      this.l6.clear();
   }

   @Override
   public final IControl get_Item(int index) {
      return this.l6.get_Item(index);
   }

   private Control l6() {
      Control var1 = new Control(this);
      var1.n5(new com.aspose.slides.ms.System.o0("6BF52A52-394A-11D3-B153-00C04F79FAA6"));
      var1.setName("WindowsMediaPlayer");
      var1.getProperties().add("URL", "");
      var1.getProperties().add("rate", "1");
      var1.getProperties().add("balance", "0");
      var1.getProperties().add("currentPosition", "0");
      var1.getProperties().add("defaultFrame", "");
      var1.getProperties().add("playCount", "1");
      var1.getProperties().add("autoStart", "-1");
      var1.getProperties().add("currentMarker", "0");
      var1.getProperties().add("invokeURLs", "-1");
      var1.getProperties().add("baseURL", "");
      var1.getProperties().add("volume", "50");
      var1.getProperties().add("mute", "0");
      var1.getProperties().add("uiMode", "full");
      var1.getProperties().add("stretchToFit", "0");
      var1.getProperties().add("windowlessVideo", "0");
      var1.getProperties().add("enabled", "-1");
      var1.getProperties().add("enableContextMenu", "-1");
      var1.getProperties().add("fullScreen", "0");
      var1.getProperties().add("SAMIStyle", "");
      var1.getProperties().add("SAMILang", "");
      var1.getProperties().add("SAMIFilename", "");
      var1.getProperties().add("captioningID", "");
      var1.getProperties().add("enableErrorDialogs", "0");
      var1.getProperties().add("_cx", "15663");
      var1.getProperties().add("_cy", "11642");
      return var1;
   }

   @Override
   public final IGenericEnumerator<IControl> iterator() {
      return this.l6.iterator();
   }

   @Override
   public final IGenericEnumerator<IControl> iteratorJava() {
      return this.l6.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.l6.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }
}
