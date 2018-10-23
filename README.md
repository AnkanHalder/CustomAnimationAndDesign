# CustomAnimationAndDesign
## Import
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  ```
  dependencies {
	        implementation 'com.github.AnkanHalder:CustomAnimationAndDesign:1.1'
	}
  ```

## Recycler Animation
---
##### Animation Left to Right
<a href="https://imgflip.com/gif/2k31vp"><img src="https://i.imgflip.com/2k31vp.gif" title="made at imgflip.com"/></a>
#### Use
```
AnimationUtils.slide_left_to_right(viewHolder);//Pass the ViewHolder Object
```

#### Example
```java
@Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        GetterSetter getset = getterSetters.get(i);
        viewHolder.textView.setText(getset.getSongName());
        viewHolder.imageView.setImageResource(getset.getResource());
        AnimationUtils.slide_left_to_right(viewHolder);	
    }
```

#### Animation Right to Left
<a href="https://imgflip.com/gif/2k30mf"><img src="https://i.imgflip.com/2k30mf.gif" title="made at imgflip.com"/></a>
#### Use
```
AnimationUtils.slide_right_to_left(viewHolder);//Pass the ViewHolder Object
```

#### Example
```java
@Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        GetterSetter getset = getterSetters.get(i);
        viewHolder.textView.setText(getset.getSongName());
        viewHolder.imageView.setImageResource(getset.getResource());
        AnimationUtils.slide_right_to_left(viewHolder);	
    }
```
### Animation Based On Scrolling
Requirs a ViewHolder Object and Boolean Value (boolean for scrolling up or down)
#### Get scroll position
```java
private int position = 0;	// Declare a integer variable Globally
```
```java
	if(prev < i)
            //Scrolling Down
        else
            //Scrolling Up
        prev=i; 	// Assigning the present value
```
#### Example
```
if(prev < i)
            AnimationUtils.wave(viewHolder,true);
        else
            AnimationUtils.wave(viewHolder,false);
        prev=i;
```
### Wave Animation
<a href="https://imgflip.com/gif/2k3402"><img src="https://i.imgflip.com/2k3402.gif" title="made at imgflip.com"/></a>
#### Use
AnimationUtils.wave(viewHolder,true);
#### Example
```java
if(prev < i)
            AnimationUtils.wave(viewHolder,true);
        else
            AnimationUtils.wave(viewHolder,false);
        prev=i;
```

### Custom Alert with/without Animation
        
